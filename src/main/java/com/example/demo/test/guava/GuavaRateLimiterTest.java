package com.example.demo.test.guava;

import com.google.common.util.concurrent.RateLimiter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-19 17:21
 */
public class GuavaRateLimiterTest {
    public static void main(String[] args) {
        test();
    }

    /**
     * 限流
     */
    public static void test() {
        String start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        // 这里的1表示每秒允许处理的量为5个
        RateLimiter limiter = RateLimiter.create(5);
        for (int i = 1; i <= 10; i++) {
            // 请求RateLimiter, 超过permits会被阻塞
            limiter.acquire();
            System.out.println("call execute.." + i);
        }
        String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("start time:" + start);
        System.out.println("end time:" + end);
    }
}
