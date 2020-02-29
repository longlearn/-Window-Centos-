package com.czl.classloader;

/**
 * ClassName:Test6
 * Package:com.czl.classloader.classloader
 * Description:
 *
 * @date:2020-2-20 10:05
 * @autor:18855032359
 */
class CL{
    static {
        System.out.println("CL static blocki");
    }
}

public class Test6 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("com.czl.classloader.CL");
        System.out.println(clazz);

        System.out.println("---------");

        clazz = Class.forName("com.czl.classloader.CL");
        System.out.println(clazz);
    }
}
