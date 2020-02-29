package com.czl.classloader;

import java.lang.reflect.Method;

/**
 * ClassName:MyTest14
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-22 11:20
 * @autor:18855032359
 */


public class MyTest14 {
    /*
    * 同一命名空间内的类是互相可见的，非同一命名空间内的类是不可见的；
    * */
    public static void main(String[] args) throws Exception {
        MyTest11 loader1 = new MyTest11("loader1");
        MyTest11 loader2 = new MyTest11("loader2");
        loader1.setPath("C:\\Users\\崔志龙\\Desktop\\");
        loader2.setPath("C:\\Users\\崔志龙\\Desktop\\");
        Class<?> clazz1 = loader1.loadClass("com.czl.classloader.Person");
        Class<?> clazz2 = loader2.loadClass("com.czl.classloader.Person");

        System.out.println(clazz1==clazz2);

        Object p1 =  clazz1.newInstance();
        Object p2 =  clazz2.newInstance();
        System.out.println(p1==p2);

        System.out.println("------------------");
        System.out.println("p1==="+p1);
        System.out.println("p2==="+p2);
        Method method = clazz1.getMethod("setObject",Object.class);
        /*
        * 当使用的时自定义加载器时，由于两个类加载器不是在同一个命名空间，所以invoke方法会报错，
        * 因为非同一命名空间内的类是不可见的；所以p2在p1对象中解析不了
        *
        *
        *
        * */
        method.invoke(p1,p2);

    }
}
