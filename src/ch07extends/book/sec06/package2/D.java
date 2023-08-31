package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {

    public D() {
        super();               //상속을 통해서만 사용 가능
    }

    public void method1() {
        this.field = "value";  //상속을 통해서만 사용 가능
        this.method();         //상속을 통해서만 사용 가능
    }

    public void method2() {
//        A a = new A();       //직접 객체 생성해서 사용하는 것은 안됨
//        a.field = "value";   //직접 객체 생성해서 사용하는 것은 안됨
//        a.method();          //직접 객체 생성해서 사용하는 것은 안됨
    }
}
