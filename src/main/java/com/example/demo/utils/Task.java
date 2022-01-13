package com.example.demo.utils;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-12-24 20:14
 */
@Component
public class Task implements ApplicationRunner {
//    @Scheduled(fixedRate = 3000)
//    public void runPerFiveSeconds() {
//        System.out.println("执行了");
//    }
//
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void runCron() {
//        System.out.println("执行了cron");
//
//    }
    @Scheduled(cron = "* 20 * * * ?")
    public void runPerFiveSeconds1() {
        System.out.println("执行了2222");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        runPerFiveSeconds1();
    }
}

