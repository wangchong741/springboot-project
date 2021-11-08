package com.example.demo.test.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-25 13:37
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Stu> stus = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            stus.add(new Stu(2021, null, "a" + i));
        }

        int i = 1;
        for (Stu stu : stus) {
            stu.setId(i++);
        }


        System.out.println(stus);


    }
}
