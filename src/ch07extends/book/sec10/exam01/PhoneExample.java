package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone p = new Phone(); // 추상 클래스로 인스턴스 생성 불가

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();        //Phone의 메서드
        smartPhone.internetSearch();
        smartPhone.turnOff();       //Phone의 메서드

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnOff();
//        phone.internetSearch();   //
    }
}
