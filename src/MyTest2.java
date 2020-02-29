import java.util.Random;

/**
 * ClassName:MyTest2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-2-18 21:00
 * @autor:18855032359
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Child2.b);
    }
}

interface Parent2{
    public static final int a = new Random().nextInt(3);
}

class Child2 implements Parent2 {
    public static int b = 5;
}
