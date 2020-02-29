package com.czl.classloader;

/**
 * ClassName:classloader
 * Package:com.czl
 * Description:
 *
 * @date:2020-2-19 17:53
 * @autor:18855032359
 */
class Parent6{
    public static int a = 5;
    static {
        System.out.println("Parent6...static block");
    }
}

class Child6{
    public static int b = 8;
    static {
        System.out.println("Child6...static block");
    }
}

public class classloader {
    public static void main(String[] args) {
        Parent6 parent6;
        System.out.println("-----------");
        parent6 = new Parent6();
        System.out.println("----------");
        System.out.println(Child6.b);
    }
    static {
        System.out.println("Main...static block");
    }
}
