package com.youyou.platform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/*
 * @description: 网关配置
 * @param
 * @return 
 * @throws
 * @author pankx
 * @date 2020/7/6 21:51
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulClientApplication
{
    public static void main( String[] args )
    {
       SpringApplication.run(ZuulClientApplication.class,args);
    }
}
