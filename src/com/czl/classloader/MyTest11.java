package com.czl.classloader;

import java.io.*;

/**
 * ClassName:MyTest11
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-20 21:49
 * @autor:18855032359
 */
public class MyTest11 extends ClassLoader {
    private String classLoaderName;
    private String path;
    private final String fileExtension=".class";

    public MyTest11(String classLoaderName){
        super();        //将系统类当做该类的父加载器
        this.classLoaderName=classLoaderName;
    }
    public MyTest11(ClassLoader parent,String classLoaderName){
        super(parent);      //显式指定该类的父加载器
        this.classLoaderName=classLoaderName;
    }

    public MyTest11(ClassLoader parent){
        super(parent);      //显式指定该类的父加载器
    }

    public void setPath(String path){
        this.path=path;
    }
    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findCalss---className="+className);

        System.out.println(File.separator);
        byte[] data=loadClassData(className);
        return defineClass(className,data,0,data.length); //define方法为父类方法
    }

    private byte[] loadClassData(String name){
        name=name.replace(".", File.separator);
        System.out.println("loadClassData---name:"+name);

        InputStream is=null;
        byte[] data=null;
        ByteArrayOutputStream baos=null;
        try{
            is=new FileInputStream(new File(this.path+name+this.fileExtension));
            baos=new ByteArrayOutputStream();
            int ch;
            while(-1!=(ch=is.read())){
                baos.write(ch);
            }
            data=baos.toByteArray();

        }catch(Exception e){
        }finally{
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return data;
    }
    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz=classLoader.loadClass("com.czl.classloader.Test6");
        //loadClass是父类方法，在方法内部调用findClass
        System.out.println(clazz.hashCode());
        Object  object=clazz.newInstance();
        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());
    }
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException {
        //父亲是系统类加载器，根据父类委托机制，MyTest1由系统类加载器加载了
       /* MyTest11 loader1=new MyTest11("loader1");
        test(loader1);

        //仍然是系统类加载器进行加载的，因为路径正好是classpath
        MyTest11 loader2=new MyTest11("loader2");
        loader2.path="D:\\Eclipse\\workspace\\HiATMP-DDMS\\arget\\classes";
        test(loader2);*/

        //自定义的类加载器被执行，findClass方法下的输出被打印。前提是当前calsspath下不存在MyTest1.class，MyTest16的父加载器-系统类加载器会尝试从classpath中寻找MyTest1。
        MyTest11 loader3=new MyTest11("loader3");
        loader3.path="C:\\Users\\崔志龙\\Desktop\\";

        test(loader3);

        loader3 = new MyTest11("loader2");
            loader3.path="C:\\Users\\崔志龙\\Desktop\\";
        test(loader3);

        System.gc();    //原先的loader3对象被卸载
        Thread.sleep(120000);

        /*System.out.println("---------------------");
        MyTest11 loader2=new MyTest11("loader2");
        loader2.path="C:\\Users\\崔志龙\\Desktop\\";

        test(loader2);

        System.out.println("---------------");
        MyTest11 loader5 = new MyTest11(loader3,"loader5");
        loader5.path="C:\\Users\\崔志龙\\Desktop\\";
        test(loader5);

        System.out.println("---------------");
        MyTest11 loader6 = new MyTest11(loader5,"loader6");
        loader6.path="C:\\Users\\崔志龙\\Desktop\\";
        test(loader6);
*/

    }

}
