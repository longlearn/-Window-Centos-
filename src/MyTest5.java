/**
 * ClassName:MyTest5
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-2-19 17:46
 * @autor:18855032359
 */
public class MyTest5 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        clazz = Class.forName("C");
        System.out.println(clazz.getClassLoader());
    }
}

class C{}