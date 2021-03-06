package com.youyou.platform.filter;    /**
 * @author Administrator
 * @date 2020/7/622:06
 * @title: MyFilter
 * @projectName youyou_platform
 * @description: TODO
 * @version 1.0
 */

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**@ClassName MyFilter
 *@description zuul做过滤器，做一些安全验证
 *@author panKx
 *@date 2020/7/6 22:06
 @Version 1.0
 **/
@Component
public class MyFilter  extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
    /**
     * filterType：返回一个字符串代表过滤器的类型，
     * 在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     *
     * **/
    @Override
    public String filterType() {
        return "pre";
    }
    /** filterOrder：过滤的顺序,数字越小，越靠前执行**/
    @Override
    public int filterOrder() {
        return 0;
    }

    /**这里可以写逻辑判断，是否要过滤，本文true,永远过滤。**/
    @Override
    public boolean shouldFilter() {
        return true;
    }
/**过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。**/
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }

}
