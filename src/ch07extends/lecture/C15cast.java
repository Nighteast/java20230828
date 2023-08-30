package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        System.out.println("프로그램 실행...");
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1; //가능
        Cat15 c1 = (Cat15) ani2; //가능

//        Cat15 c2 = (Cat15) ani1; //불가능, 문법 오류는 아님
//        Dog15 d2 = (Dog15) ani2; //불가능, 문법 오류는 아님

        System.out.println("프로그램 실행 계속됨...");

    }
}

class Animal15 {
}

class Dog15 extends Animal15 {
}

class Cat15 extends Animal15 {
}