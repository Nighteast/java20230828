package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    public static void method1() throws ClassNotFoundException {
        System.out.println("code1");
        method2();
        System.out.println("code2"); // 이 메서드를 호출해야 한다면 try-catch를 써야한다.

    }

    public static void method2() throws ClassNotFoundException {
        method3();
    }

    public static void method3() throws ClassNotFoundException {}

}
