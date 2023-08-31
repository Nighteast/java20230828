package ch08interface.book.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  //자동타입변환 -> 오버라이딩 메서드 호출 -> 다형성
        driver.drive(taxi); //자동타입변환 -> 오버라이딩 메서드 호출 -> 다형성

    }
}
