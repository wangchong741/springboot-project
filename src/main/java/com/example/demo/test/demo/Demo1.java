package com.example.demo.test.demo;


import org.springframework.util.StopWatch;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-25 13:37
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        StopWatch sw = new StopWatch();
        sw.start("A");
        Thread.sleep(500);
        sw.stop();
        System.out.println(sw.prettyPrint());
    }
}
