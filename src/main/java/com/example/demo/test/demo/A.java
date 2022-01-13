package com.example.demo.test.demo;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-12-29 11:38
 */
public class A {

    public void test(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new A();
        a.test();

        B b = new B();
        b.test();
    }
}

class B extends A {
    public void test(){
        System.out.println("B");
    }
}
