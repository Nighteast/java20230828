package ch07extends.lecture;

public class C26abstract {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath(); // Animal26 타입이지만 참조하는 것은 Dog26이고 override된 메서드를 실행한다.

        Animal26 a2 = new Fish26();
        a2.breath();

        Fish26 f1 = new Fish26();
        f1.breath();

    }
}

//추상 메서드를 가진 클래스는 꼭 추상 클래스로 선언해야 한다.
abstract class Animal26 {
    //추상 메서드 : 몸통이 없는 메서드
    abstract public void breath();
}

class Dog26 extends Animal26 {
    //추상클래스를 상속했기 때문에 추상메서드를 꼭 재정의(override) 해야함
    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉰다.");
    }
}

class Fish26 extends Animal26 {
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉰다.");
    }
}
