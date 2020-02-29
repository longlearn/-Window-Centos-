package com.czl.classloader;

/**
 * ClassName:MyCat
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-21 19:27
 * @autor:18855032359
 */
public class MyCat {
    public MyCat() {
        System.out.println("MyCat was loaded by classLoader:"+this.getClass().getClassLoader());
//        System.out.println("from MyCat::"+MySample.class);
    }
}
