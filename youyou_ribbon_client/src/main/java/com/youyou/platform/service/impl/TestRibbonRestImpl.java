package com.youyou.platform.service.impl;    /**
 * @author Administrator
 * @date 2020/7/51:06
 * @title: impl
 * @projectName youyou_platform
 * @description: TODO
 * @version 1.0
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.youyou.platform.service.TestRibbonRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**@ClassName TestRibbonRestImpl
 *@description TODO
 *@author panKx
 *@date 2020/7/5 1:06
 @Version 1.0
 **/
@Service
public class TestRibbonRestImpl implements TestRibbonRestService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name,String.class);
    }
    public String helloError(String name) {
        return "hello,"+name+",sorry,error!";
    }
}
