package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1(); // Child()인스턴스를 참조하고 있지만, Child는 Parent를 상속하고 있고 Parent-method1 메소드가 들어있음.
        parent.method2(); // Child()인스턴스를 참조하고 있고, Child의 method2 메소드는 재정의(override)되어 실행된다.
//        parent.method3(); // 호출 불가능
    }
}
