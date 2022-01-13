package com.example.demo.controller;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.impl.ServiceTestImpl;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-19 16:27
 */
@RestController
public class TestController {

    @Resource
    private ServiceTestImpl serviceTest;

    @GetMapping("a")
    public String say111() {
        serviceTest.test(1);
        return "hello";
    }


    @GetMapping
    public String say() {
        serviceTest.test(1);
        return "hello";
    }


    @GetMapping("test")
    public String say1() throws Exception {
        ExecutorService executorService = ThreadUtil.newExecutor();
        System.out.println("start");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        UserInfo userInfo = new UserInfo();
        CompletableFuture future1 = CompletableFuture.supplyAsync(() -> {
            getUserInfo1("1", userInfo);
            return true;
        }, executorService);

        CompletableFuture future2 = CompletableFuture.supplyAsync(() -> {
            getUserInfo2("1", userInfo);
            return true;
        }, executorService);

        CompletableFuture future3 = CompletableFuture.supplyAsync(() -> {
            getUserInfo3("1", userInfo);
            return true;
        }, executorService);
        future1.get();
        future2.get();
        future3.get();

        stopWatch.stop();
        System.out.println("time:" + stopWatch.getTotalTimeMillis());
        System.out.println("end");
        return "hello";
    }

    @GetMapping("test1")
    public String say2() throws Exception {
        System.out.println("start");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        UserInfo userInfo = new UserInfo();
        getUserInfo1("1", userInfo);
        getUserInfo2("1", userInfo);
        getUserInfo3("1", userInfo);
        stopWatch.stop();
        System.out.println("time:" + stopWatch.getTotalTimeMillis());
        System.out.println("end");

        List<Entity> entities = Db.use().query("");
        return "hello";
    }

    private void getUserInfo1(String id, UserInfo userInfo) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userInfo.setName("name");
    }

    private void getUserInfo2(String id, UserInfo userInfo) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userInfo.setAge("age");
    }

    private void getUserInfo3(String id, UserInfo userInfo) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userInfo.setAdd("add");
    }


}
