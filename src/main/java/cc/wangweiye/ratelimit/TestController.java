package cc.wangweiye.ratelimit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RateLimitAspect
    @RequestMapping("/test")
    public String test() {
        return "成功";
    }
}
