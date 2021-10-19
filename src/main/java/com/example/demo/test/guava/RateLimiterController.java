package com.example.demo.test.guava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-19 18:24
 */
@RestController
public class RateLimiterController {
    @Resource
    private GuavaRateLimiterService guavaRateLimiterService;

    @GetMapping("/ratelimiter")
    public String testRateLimiter() {
//        String start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        if (guavaRateLimiterService.tryAcquire()) {
            System.out.println("ok");
            return "ok";
        }
        System.out.println("fail");
//        String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//        System.out.println("start time:" + start);
//        System.out.println("end time:" + end);
        return "fail";
    }
}
