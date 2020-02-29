package com.czl.classloader;

/**
 * ClassName:MyTest12_1
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-22 10:35
 * @autor:18855032359
 */
public class MyTest12_1 {
    public static void main(String[] args) throws Exception {
        MyTest11 loader3 = new MyTest11("loader1");
        loader3.setPath("C:\\Users\\崔志龙\\Desktop\\");
        Class<?> clazz = loader3.loadClass("com.czl.classloader.MySample");
        System.out.println("classLoader::"+clazz.getClassLoader());
        System.out.println("class::"+clazz.hashCode());
        /*
        * 如果只删除classpath下的MyCat的class文件，则会抛出NoClassDefFoundError，
        * 如果只删除classpath下的MySample的class文件，则由自定义的类加载器加载MySamlple,系统类加载器加载MyCat
        *
        * 原因：①当只删除classpath下的MyCat的class文件时，MySample类仍由系统类加载器加载，而系统类加载器加载及其父类加载不了MyCat类。
        * */
        Object object = clazz.newInstance();
    }
}
