package cloud.service.consumer;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix  // 消费者侧服务降级
@EnableCircuitBreaker // 生产者侧服务降级
public class ServiceConsumerMainHystrix {
}
