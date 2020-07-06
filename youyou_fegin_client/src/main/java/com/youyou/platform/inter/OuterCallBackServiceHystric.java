package com.youyou.platform.inter;    /**
 * @author Administrator
 * @date 2020/7/621:41
 * @title: OuterCallBackServiceHystric
 * @projectName youyou_platform
 * @description: TODO
 * @version 1.0
 */

import org.springframework.stereotype.Component;

/**@ClassName OuterCallBackServiceHystric
 *@description hystric 回调函数
 *@author panKx
 *@date 2020/7/6 21:41
 @Version 1.0
 **/
@Component
public class OuterCallBackServiceHystric implements OuterModuleInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
