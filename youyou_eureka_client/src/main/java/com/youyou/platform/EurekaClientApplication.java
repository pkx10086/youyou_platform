package com.youyou.platform;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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
@EnableDiscoveryClient
public class EurekaClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaClientApplication.class, args );
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
