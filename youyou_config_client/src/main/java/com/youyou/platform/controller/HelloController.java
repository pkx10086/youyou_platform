package com.youyou.platform.controller;    /**
 * @author Administrator
 * @date 2020/7/622:49
 * @title: HelloController
 * @projectName youyou_platform
 * @description: TODO
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**@ClassName HelloController
 *@description TODO
 *@author panKx
 *@date 2020/7/6 22:49
 @Version 1.0
 **/

@RestController
public class HelloController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
