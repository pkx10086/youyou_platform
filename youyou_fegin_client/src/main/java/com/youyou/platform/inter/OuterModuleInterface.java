package com.youyou.platform.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;






/**
 *@author Administrator
 * @date 2020/7/616:30
 * @title: OuterModuleInterface
 * @projectName youyou_platform
 * @description: TODO
 *@version 1.0
 */
@FeignClient(value = "eureka-client",fallback = OuterCallBackServiceHystric.class)
 public interface OuterModuleInterface {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
