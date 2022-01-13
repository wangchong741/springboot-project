package com.example.demo.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-12-27 14:29
 */
@Component
public class ServiceTestImpl {

    @Async
    public void test(int i) {
        try {
            Thread.sleep(10000);
            System.out.println("aaaaaaaaa"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
