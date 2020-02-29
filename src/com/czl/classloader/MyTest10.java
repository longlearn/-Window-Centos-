package com.czl.classloader;

import java.io.*;

/**
 * ClassName:MyTest10
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-20 17:58
 * @autor:18855032359
 */
public class MyTest10 extends ClassLoader {
    private String classLoaderName;
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    private final String fileExtention = ".class";

    public MyTest10(String classLoaderName){
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyTest10(ClassLoader parent,String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "MyTest10{" +
                "classLoaderName='" + classLoaderName + '\'' +
                ", fileExtention='" + fileExtention + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("name----"+name);
        byte[] data = loadClassData(name);
        return defineClass(name,data,0,data.length);
    }

    private byte[] loadClassData(String name) {
        System.out.println(name);
        InputStream ism = null;
        byte[] data = null;
        ByteArrayOutputStream bops = null;
        try {
//            this.classLoaderName = this.classLoaderName.replace(".", File.pathSeparator);
            ism = new FileInputStream(new File(name+this.fileExtention));
            bops = new ByteArrayOutputStream();
            int ch = 0;
            while (-1!=(ch=ism.read())) {
                bops.write(ch);
            }
            data = bops.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ism.close();
                bops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        MyTest10 myTest10 = new MyTest10("loader1");
        test(myTest10);
    }

    public static void test(ClassLoader classLoader) throws Exception{
        Class<?> clazz = classLoader.loadClass("com.czl.classloader.MyTest8");
        Object o = clazz.newInstance();
        System.out.println(o.getClass().getClassLoader());

        System.out.println(o);
    }
}
