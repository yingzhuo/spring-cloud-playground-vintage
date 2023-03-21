package cloud.service.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:ribbon.properties")
public class ServiceConsumerMainRibbon {
}
