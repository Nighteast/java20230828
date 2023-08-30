package ch07extends.lecture;

public class C28final {
}

class MyClass28 {
    // final 메서드는 재정의 할 수 없음
    final void method1() {
        System.out.println("어떤 메서드");
    }
}

class MySubClass281 extends MyClass28 {
//    void method1() {
//        //final 메서드는 재정의 할 수 없음
//    }
}