package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);

        // 메서드 참조 (method reference)
        // 파라미터 값이 다른 메서드의 참조로 들어가기만 하는 람다식은 참조식으로 더 줄일 수 있다.
        MyInterface06 o2 = C06methodReference::someMethod;

    }

    public static void someMethod(int x) {

    }
}

interface MyInterface06 {
    void method(int a);
}
