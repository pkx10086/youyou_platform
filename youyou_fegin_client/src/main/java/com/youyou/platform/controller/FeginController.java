package com.youyou.platform.controller;

import com.youyou.platform.inter.OuterModuleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**@ClassName FeginController
 *@description TODO
 *@author panKx
 *@date 2020/7/6 17:02
 @Version 1.0
 **/
@RestController
public class FeginController {
    @Autowired
    OuterModuleInterface outerModuleInterface;

    @RequestMapping("feginHello")
    public String feginHello(@RequestParam("name")String name){
        return outerModuleInterface.sayHiFromClientOne(name);

    }
}
