package ch07extends.book.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    public void stop() {          // final 메서드는 오버라이딩 할 수 없음.
//        System.out.println("스포츠카를 멈춥니다.");
//        speed = 0;
//    }
}
