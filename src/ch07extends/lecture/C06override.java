package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10(); // "자식 클래스의 메소드"
    }
}

class MySubClass061 extends MyClass06 {
    @Override
    public void method10() {
        System.out.println("자식 클래스의 메소드");
    }
}
class MyClass06 {
    public void method10() {
        System.out.println("부모 클래스의 메소드");
    }
}