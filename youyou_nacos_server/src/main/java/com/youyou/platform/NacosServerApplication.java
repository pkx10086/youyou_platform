package com.youyou.platform;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NacosServerApplication.class, args);
    }
}
