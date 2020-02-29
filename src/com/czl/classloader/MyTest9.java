package com.czl.classloader;

/**
 * ClassName:MyTest9
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-20 11:41
 * @autor:18855032359
 */
public class MyTest9 {
    /**
     * Class objects for array classes are not created by class loaders,
     * but are created automatically as required by the Java runtime.
     * The class loader for an array class,
     * as returned by Class.getClassLoader() is the same as the class loader for its element type;
     * if the element type is a primitive type, then the array class has no class loader.
     *即：
     * 数组类的类对象不是由类加载器创建的，而是根据Java运行时的要求自动创建的。
     * 由Class.getClassLoader（）返回的数组类的类加载器与其元素类型的类加载器相同。
     * 如果元素类型是原始类型，则数组类没有类加载器。
     * */
    public static void main(String[] args) {
        String[] str = new String[2];
        System.out.println(str.getClass().getClassLoader());//null 表示根类加载器
        System.out.println("----------");
        MyTest8[] test8s = new MyTest8[2];
        System.out.println(test8s.getClass().getClassLoader());//AppClassLoader  表示系统类加载器
        System.out.println("------------");
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());//null 表示数组中若为原始类型元素，
                                                             // 则此数组没有类加载器
        Integer[] ints1 = new Integer[2];
        System.out.println(ints1.getClass().getClassLoader());//null 表示根类加载器  包装类不是原始元素，
                    //且包装类和String类都在java.lang包中，因此该数组是由根类加载器加载的
    }
}
