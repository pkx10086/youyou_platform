package youyou_platform;

/*
 * @description: eureka 注册服务中心
 * @param
 * @return
 * @throws
 * @author pankx
 * @date 2020/7/4 21:31
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class, args );
    }
}
