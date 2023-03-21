package cloud.service.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayServerMainGateway {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        // 本例中无配置
        // RouteLocator 配置方式太复杂，推荐使用yaml配置
        RouteLocatorBuilder.Builder routes = builder.routes();
        return routes.build();
    }

}
