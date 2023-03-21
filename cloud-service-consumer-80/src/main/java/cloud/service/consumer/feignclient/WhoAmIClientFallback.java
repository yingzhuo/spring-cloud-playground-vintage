package cloud.service.consumer.feignclient;

import cloud.api.commons.spring.OpenFeignClientFallback;

@OpenFeignClientFallback
public class WhoAmIClientFallback implements WhoAmIClient {

    @Override
    public String whoami() {
        return "服务降级 (消费者侧)";
    }

    @Override
    public String slowWhoami() {
        return "服务降级 (消费者侧)";
    }

    @Override
    public String verySlowWhoami() {
        return "服务降级 (消费者侧)";
    }

    @Override
    public String badWhoami(int param) {
        return "服务降级 (消费者侧)";
    }

}
