package com.czl.classloader;

/**
 * ClassName:MyTest12
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-21 19:30
 * @autor:18855032359
 */
public class MyTest12 {
    public static void main(String[] args) throws Exception {
        MyTest11 myTest11 = new MyTest11("loader1");
        Class<?> clazz = myTest11.loadClass("com.czl.classloader.MySample");
        System.out.println("class::"+clazz.hashCode());
        /*
        * 使用TraceClassLoading参数可以看出
        * 当下面的语句注释之后，MySample类会被加载，
        * 而MyCat类并不会被加载，JVM会只会提前加载程序中可能会被用到的类。
        * */
        Object object = clazz.newInstance();
    }
}
