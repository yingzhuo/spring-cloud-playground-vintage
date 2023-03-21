package cloud.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceConsumerMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerMain80.class, args);
    }

}
