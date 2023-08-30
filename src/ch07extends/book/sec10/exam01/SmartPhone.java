package ch07extends.book.sec10.exam01;

public class SmartPhone extends Phone {
    //생성자 선언
    SmartPhone(String owner) {
        super(owner);
    }

    //메서드 선언
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
