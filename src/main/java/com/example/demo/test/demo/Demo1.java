package com.example.demo.test.demo;


import java.math.BigDecimal;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-25 13:37
 */
public class Demo1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(123);
        BigDecimal bigDecimal1 = new BigDecimal(-123);
        BigDecimal bigDecimal2 = new BigDecimal(-0);
        System.out.println(bigDecimal.compareTo(BigDecimal.ZERO));
        System.out.println(bigDecimal1.compareTo(BigDecimal.ZERO));
        System.out.println(bigDecimal2.compareTo(BigDecimal.ZERO));
    }
}
