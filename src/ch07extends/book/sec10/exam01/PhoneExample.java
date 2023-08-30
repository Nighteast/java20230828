package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();        //Phone의 메서드
        smartPhone.internetSearch();
        smartPhone.turnOff();       //Phone의 메서드
    }
}
