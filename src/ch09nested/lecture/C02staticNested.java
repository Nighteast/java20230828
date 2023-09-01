package ch09nested.lecture;

public class C02staticNested {
    public static void main(String[] args) {
        MyClass02.NestedClass02 o1 = new MyClass02.NestedClass02();
    }
}

class MyClass02 {
    static class NestedClass02 {    //static이 붙었으니 인스턴스 생성 없이 바로 접근 가능
        //필드, 생성자, 메서드
    }

    void method1() {
        NestedClass02 o2 = new NestedClass02();
    }

}