package ch07extends.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        MyClass09 o2 = o1; // ok

//        String o3 = o1; // not ok
//        MyClass08 o4 = o1; // not ok

        MyClass09 o3 = new MyClass09();
//        MySubClass091 o4 = o3; // not ok

        System.out.println("System.identityHashCode(o1) = " + System.identityHashCode(o1));
        System.out.println("System.identityHashCode(o2) = " + System.identityHashCode(o2));
        System.out.println("System.identityHashCode(o3) = " + System.identityHashCode(o3));

        o1.method1(); // 변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행 (변수 타입 MySubClass091 / 인스턴스 MySubClass091 )
        o2.method1(); // 변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행 (변수 타입 MyClass09 / 인스턴스 MySubClass091 )
        o3.method1(); // (변수 타입 MyClass09 / 인스턴스 MyClass09)

    }
}

class MyClass09 {
    void method1() {
        System.out.println("부모 메소드");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("자식 메소드");
    }
}