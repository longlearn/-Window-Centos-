package com.czl.classloader;

/**
 * ClassName:MyTest13
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-22 11:15
 * @autor:18855032359
 */
public class MyTest13 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));//根加载器路径
        System.out.println(System.getProperty("java.ext.dirs"));//扩展类加载器路径
        System.out.println(System.getProperty("java.class.path"));//应用类加载器路径

    }
}
