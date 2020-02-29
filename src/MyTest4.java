/**
 * ClassName:MyTest4
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-2-19 11:06
 * @autor:18855032359
 */
public class MyTest4 {
    public static void main(String[] args) {
        System.out.println(MyChild4.b);
    }
}

class MyParent4{
    public static final Thread t = new Thread() {
        {
            System.out.println("MyParent4...invoke");
        }
    };
}

class MyChild4 extends MyParent4{
    public static int b = 6;
}

interface MyParent4_1{
    public static Thread t = new Thread() {
        {
            System.out.println("MyParent4_1...invoke");
        }
    };
}

interface MyChild4_1 extends MyParent4_1{
    public static Thread t1 = new Thread() {
        {
            System.out.println("MyChild4_1...invoke");
        }
    };
}