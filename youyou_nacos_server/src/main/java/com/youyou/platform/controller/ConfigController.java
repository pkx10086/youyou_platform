package com.youyou.platform.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**@ClassName ConfigController
 *@description
 *@author panKx
 *@date 2020/7/19 20:47
 @Version 1.0
 **/
@Controller
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }
}
