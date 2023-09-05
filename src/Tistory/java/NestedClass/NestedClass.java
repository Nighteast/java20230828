package Tistory.java.NestedClass;

public class NestedClass {

    // 내부 클래스
    class A1 {
        class B1 {/* ··· */}
    }

    // 정적 중첩 클래스
    class A2 {
        static class B2 {/* ··· */}
    }

    // 지역 클래스
    class A3 {
        void method() {
            class B3 {/* ··· */}
        }
    }


}
