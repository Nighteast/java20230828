package Tistory.java.EqualsAndHashCode.Exam2;

import java.util.Objects;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

public class Exam {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        Person p2 = new Person("홍길동");

        //equals를 재정의 하여 인스턴스 변수의 값 자체를 비교하게 해주어야 한다.
        System.out.println(p1 == p2);       //false
        System.out.println(p1.equals(p2));  //true
    }
}
