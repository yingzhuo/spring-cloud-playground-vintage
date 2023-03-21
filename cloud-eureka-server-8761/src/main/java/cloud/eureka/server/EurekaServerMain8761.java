package cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMain8761 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain8761.class, args);
    }

}
