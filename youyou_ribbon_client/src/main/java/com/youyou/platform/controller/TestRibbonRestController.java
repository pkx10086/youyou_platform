package com.youyou.platform.controller;    /**
 * @author Administrator
 * @date 2020/7/51:04
 * @title: TestRibbonRestController
 * @projectName youyou_platform
 * @description: TODO
 * @version 1.0
 */

import com.youyou.platform.service.TestRibbonRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**@ClassName TestRibbonRestController
 *@description 测试ribbon+rest
 *@author panKx
 *@date 2020/7/5 1:04
 @Version 1.0
 **/
@RestController
public class TestRibbonRestController {

    @Autowired
    private TestRibbonRestService testRibbonRestService;
    @RequestMapping("helloRibbon")
    public String helloRibbon(String name) {
        return testRibbonRestService.hello(name);
    }
}
