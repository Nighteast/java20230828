package ch09nested.book.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;

        static int field2 = 2;

        B() {
            System.out.println("B생성자 실행");
        }

        void method1() {
            System.out.println("B메서드1 실행");
        }

        static void method2() {
            System.out.println("B메서드2 실행 (스테틱)");
        }
    }
}
