package com.czl.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * ClassName:MyTest8
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-20 10:23
 * @autor:18855032359
 */
public class MyTest8 {
    public static void main(String[] args) throws IOException {
            ClassLoader loader=Thread.currentThread().getContextClassLoader();
            System.out.println(loader);         //输出AppClassLoader
            //下面这段没整明白什么用，先记录下来
            String resourceName="com/czl/classloader/MyTest7.class";
            Enumeration<URL> urls=loader.getResources(resourceName);
            while(urls.hasMoreElements()){
                System.out.println(urls);
                URL url=urls.nextElement();
//                System.out.println(url.getContent());
                System.out.println(url);
            }
        }
}
