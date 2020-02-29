package com.czl.classloader;

import java.sql.Driver;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ClassName:MyTest17
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-24 10:02
 * @autor:18855032359
 */
public class MyTest17 {
    public static void main(String[] args) {
//        Thread.currentThread().setContextClassLoader(MyTest17.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader =  ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();

        while(iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("class:::"+driver.getClass()+"---loader::"+driver.getClass().getClassLoader());
        }

        System.out.println("当前线程上下文类加载器："+Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器："+ServiceLoader.class.getClassLoader());
    }

}
