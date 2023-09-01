package ch09nested.lecture;

public class C06localClass {
    public static void main(String[] args) {
        class LocalClass {

        }
    }

    public static void method1() {
        class LocalClass {

        }
    }

    public void method2() {
        class LocalClass {
            //필드, 생성자, 메서드
            //메서드 안에서만 사용할 목적 (일회용)
        }

        LocalClass o1 = new LocalClass();
    }
}
