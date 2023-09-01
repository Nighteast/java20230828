package ch09nested.lecture;

public class C04access {
    // static member는 instance member에 접근할 수 없다.

    int instanceField04;

    static int staticField04;

    static class StaticNestedClass04 {
        void method1() {
//            System.out.println(instanceField04); // 스태틱 -> 인스턴스 접근 불가
            System.out.println(staticField04); // 스태틱 -> 스태틱 접근 가능
        }
    }
    class InnerClass04 {
        void method1() {
            System.out.println(instanceField04); // 인스턴스 -> 인스턴스 접근 가능
            System.out.println(staticField04); // 인스턴스 -> 스태틱 접근 가능
        }
    }
}
