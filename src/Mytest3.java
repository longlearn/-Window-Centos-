/**
 * ClassName:Mytest3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-2-19 9:23
 * @autor:18855032359
 */
public class Mytest3 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(Singleton.count1);
        System.out.println(Singleton.count2 );
    }
}

class Singleton {
    public static int count1;
//    public static int count2 = 0;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        count1++;
        count2++;
    }
    public static int count2 = 0;
    public static Singleton getSingleton() {
        return singleton;
    }
}