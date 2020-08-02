package com.youyou.platform;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@NacosPropertySource(dataId = "exceptionId", autoRefreshed = true)
public class NacosDiscoveryApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NacosDiscoveryApplication.class, args);    }
}
