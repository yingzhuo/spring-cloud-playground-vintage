package cloud.service.provider.service;

import cloud.api.commons.util.SleepUtils;
import cloud.api.commons.util.UUIDUtils;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @see com.netflix.hystrix.HystrixCommandProperties
 */
@Service
@DefaultProperties(
        defaultFallback = "global_fallback",
        commandProperties = {
                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
                @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
                @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"), // 请求次数
                @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
                @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"), // 失败率达到多少跳闸
        }
)
public class WhoamiServiceImpl implements WhoamiService {

    @Value("${server.port}")
    private int port;

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String whoami() {
        String uuid = UUIDUtils.random();
        return "service from ServiceProvider-Node (" + uuid + ") " + port;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    @HystrixCommand
    public String slowWhoami() {
        SleepUtils.sleep(2);
        String uuid = UUIDUtils.random();
        return "service from ServiceProvider-Node (" + uuid + ") " + port;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    @HystrixCommand
    public String verySlowWhoami() {
        SleepUtils.sleep(7);
        String uuid = UUIDUtils.random();
        return "service from ServiceProvider-Node (" + uuid + ") " + port;
    }

    @Override
    @HystrixCommand
    public String badWhoami(int param) {
        if (param <= 0) {
            throw new UnsupportedOperationException("未实现此功能");
        }
        String uuid = UUIDUtils.random();
        return "service from ServiceProvider-Node (" + uuid + ") " + port;
    }

    public String global_fallback() {
        // 服务降级的两种情况:
        // 1. 超时
        // 2. 发生异常
        return "服务降级 (生产者侧)";
    }

}
