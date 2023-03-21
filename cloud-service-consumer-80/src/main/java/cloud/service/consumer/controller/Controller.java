package cloud.service.consumer.controller;

import cloud.service.consumer.feignclient.WhoAmIClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    private final WhoAmIClient client;

    @Nullable
    @GetMapping("/whoami")
    public String whoami() {
        return client.whoami();
    }

    @Nullable
    @GetMapping("/slow-whoami")
    public String slowWhoami() {
        return client.slowWhoami();
    }

    @Nullable
    @GetMapping("/very-slow-whoami")
    public String verySlowWhoami() {
        return client.verySlowWhoami();
    }

    @Nullable
    @GetMapping("/bad-whoami")
    public String badWhoami(@RequestParam("p") int param) {
        return client.badWhoami(param);
    }

}
