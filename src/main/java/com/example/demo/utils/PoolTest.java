package com.example.demo.utils;


import cn.hutool.core.thread.ThreadUtil;
import com.example.demo.test.demo.Stu1;

import java.util.concurrent.CountDownLatch;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-12-27 11:20
 */
public class PoolTest {

    public static void main(String[] args) {
        CountDownLatch count=new CountDownLatch(10);
        insert(new Stu1(100,1,"1","1"),count);
    }

    public static void insert(Stu1 stu1, CountDownLatch count) {

        System.out.println(count.getCount());
        if (count.getCount() == 0) {
            return;
        }

        try {
            System.out.println("执行第" + count.getCount() + "次");
        } catch (Exception e) {
            count.countDown();
            insert(stu1, count);
        }
    }

    public synchronized void test(){
        System.out.println(1111);
    }

}
