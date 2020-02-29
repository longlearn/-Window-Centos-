package com.czl.classloader;

/**
 * ClassName:MyTest15
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-22 20:14
 * @autor:18855032359
 */

/*
* 在Terminal中执行命令：①cd out/production/jvm_lecture
* ②java -Djava.ext.dirs=./ com.czl.classloader.MyTest15
* 使扩展类加载器加载路径改为当前classpath路径，
* 但是扩展类加载器只加载jar包，需要把class文件打成jar
* 所以要把所加载的类打成jar包才会由扩展类加载器加载
*
* */
public class MyTest15 {
    static {
        System.out.println("MyTest15 initializer... ");
    }

    public static void main(String[] args) {
        System.out.println(MyTest15.class.getClassLoader());
        System.out.println(MyCat.class.getClassLoader());
    }
}
