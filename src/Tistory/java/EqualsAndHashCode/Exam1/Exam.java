package Tistory.java.EqualsAndHashCode.Exam1;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class Exam {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        Person p2 = new Person("홍길동");

        // 두 방법 모두 객체타입의 주소값을 비교하기 때문에 타입과 이름이 일치하지만 전부 false가 나오는 상황
        // 중복이 허용되지 않는 상황에서 오류를 발생시킬 수 있다.
        System.out.println(p1 == p2);       //false
        System.out.println(p1.equals(p2));  //false
    }
}
