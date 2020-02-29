package com.czl.classloader;

/**
 * ClassName:MySample
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-21 19:28
 * @autor:18855032359
 */
public class MySample {

    /*
    * 子加载器所加载的类能够访问父加载器所加载的类；
    * 而父加载器所加载的类无法访问子加载器所加载的类。
    */
    public MySample(){
        MyCat myCat = new MyCat();
        System.out.println("MySample was loaded by classLoader:"+this.getClass().getClassLoader());
        System.out.println("from MySample:::==="+MyCat.class);
    }
}
