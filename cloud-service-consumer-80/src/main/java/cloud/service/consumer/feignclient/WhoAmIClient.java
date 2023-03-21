package cloud.service.consumer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "CLOUD-SERVICE-PROVIDER",
        fallback = WhoAmIClientFallback.class
)
public interface WhoAmIClient {

    @Nullable
    @GetMapping("/whoami")
    public String whoami();

    @Nullable
    @GetMapping("/slow-whoami")
    public String slowWhoami();

    @Nullable
    @GetMapping("/very-slow-whoami")
    public String verySlowWhoami();

    @Nullable
    @GetMapping("/bad-whoami")
    public String badWhoami(@RequestParam("p") int param);

}
