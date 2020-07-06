package com.youyou.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 * @description: eureka客户端
 * @param
 * @return 
 * @throws
 * @author pankx
 * @date 2020/7/5 0:32
 */

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaClientApplication.class, args );
    }
}
