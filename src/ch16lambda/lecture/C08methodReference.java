package ch16lambda.lecture;

public class C08methodReference {
    public static void main(String[] args) {
        MyClass08 o2 = new MyClass08();
        MyInterface08 o1 = ((x, y) -> o2.otherMethod(x,y));
        MyInterface08 o3 = o2::otherMethod; //인스턴스 메서드를 참조할때는 객체를 먼저 생성하고 쓴다.
    }
}

class MyClass08 {
    void otherMethod(int x, int y) {

    }
}

interface MyInterface08 {
    void method(int x, int y);
}
