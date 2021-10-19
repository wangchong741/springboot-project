package com.example.demo.test.guava;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-19 18:21
 */
@Service
public class GuavaRateLimiterService {
    //每秒控制5个许可
    RateLimiter limiter = RateLimiter.create(1.0);

    /**
     * 获取令牌
     * @return
     */
    public boolean tryAcquire(){
        return limiter.tryAcquire();
    }
}
