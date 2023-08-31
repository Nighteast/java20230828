package Tistory.java.accessModifier;

public class Person {
    private String name;

    public void name(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name("John");  // name 설정
        System.out.println("Name: " + person.getName());  // getName으로 이름 출력
    }
}
