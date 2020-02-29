package com.czl.classloader;

/**
 * ClassName:MyTest7
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-20 10:14
 * @autor:18855032359
 */
public class MyTest7 {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);

        System.out.println("-----------");

        while (loader!=null) {
            loader = loader.getParent();
            System.out.println(loader);
            System.out.println("----------");
        }
    }
}
