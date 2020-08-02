package com.youyou.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**@ClassName TestController
 *@description 测试注册中心
 *@author panKx
 *@date 2020/7/5 0:33
 @Version 1.0
 **/

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "pankx") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam(value = "name", defaultValue = "pankx") String name){
        return restTemplate.getForObject("http://RIBBON-CLIENT/helloRibbon?name="+name,String.class);
    }

}
