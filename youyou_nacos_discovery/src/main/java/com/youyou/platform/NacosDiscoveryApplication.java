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
        System.out.print("1111111111");
        SpringApplication.run(NacosDiscoveryApplication.class, args);    }
}
