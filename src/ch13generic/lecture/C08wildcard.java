package ch13generic.lecture;

import ch07extends.book.exercise.p04.package1.MyClass;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>();
        MyClass08<?> o2 = new MyClass08<Dog>();
        MyClass08<?> o3 = new MyClass08<Cat>();
        MyClass08<?> o4 = new MyClass08<Object>();

        o1.equals(null);
        o2.toString();
        o3.hashCode();

//        MyClass08<Object> o5 = new MyClass08<Dog>();   //이게 안되서 ?로 만듦 Object상속받은 메서드들 사용하기위해
    }

    public void otherMethod() {
        someMethod(new MyClass08<Object>());
        someMethod(new MyClass08<Animal>());
        someMethod(new MyClass08<Dog>());
        someMethod(new MyClass08<Cat>());
    }

    public void someMethod(MyClass08<?> param) {
        param.hashCode();
        param.equals(null);
        param.toString();
    }
}

class MyClass08<T> {

}