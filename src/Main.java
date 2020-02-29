public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(MyChild1.a);
    }

}

class Myparent1 {
    public Myparent1(){
        System.out.println("Mypatent1 Constructor...");
    }

    public static int a = 8;
    static {
        System.out.println("Myparent1 Static..."+a);
    }
}

class MyChild1 extends Myparent1 {


    public MyChild1() {
        System.out.println("MyChild1 Constructor...");
    }
    public static int b = 9;

    static {
        System.out.println("MyChild Static..."+b);b = 10;

    }
}