package ch07extends.book.sec05.exam02;

public class Car {
    //필드 선언
    public int speed;

    //메서드 선언
    public void speedUp() {
        speed+=1;
    }

    //final 메서드
    public final void stop() {
        System.out.println("차를 멈춥니다.");
        speed = 0;
    }

}
