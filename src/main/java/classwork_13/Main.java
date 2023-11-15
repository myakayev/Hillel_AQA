package classwork_13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start program");
        method1();
        System.out.println("Finish program");

    }
    static void method1() {
        System.out.println("start method 1");
        method3();
    }

    static void method2() {
        System.out.println("start method 2");
    }

    static void method3() {
        System.out.println("start method 3");
        method2();
        // throw new MyAppException();
        //System.out.println("finish method 3");

    }

}
