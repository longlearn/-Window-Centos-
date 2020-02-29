package com.czl.classloader;

/**
 * ClassName:MyTest16
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-23 19:39
 * @autor:18855032359
 */
public class MyTest16 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
