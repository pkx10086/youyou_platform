package com.youyou.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @Descprion 配置中心
 * @author pankx
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
