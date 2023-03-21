package cloud.service.provider.controller;

import cloud.service.provider.service.WhoamiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    private final WhoamiService service;

    @GetMapping("/whoami")
    public String whoami() {
        return service.whoami();
    }

    @GetMapping("/slow-whoami")
    public String slowWhoami() {
        return service.slowWhoami();
    }

    @GetMapping("/very-slow-whoami")
    public String verySlowWhoami() {
        return service.verySlowWhoami();
    }

    @GetMapping("/bad-whoami")
    public String badWhoami(@RequestParam("p") int param) {
        return service.badWhoami(param);
    }

}
