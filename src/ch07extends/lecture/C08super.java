package ch07extends.lecture;

public class C08super {
    public static void main(String[] args) {
        MySubClass081 o1 = new MySubClass081();
        o1.method();

        // 출력결과
        // "자식의 메소드!"
        // "부모의 메소드!"

        // MyClass08을 상속받는 MySubClass081 작성
    }
}
class MyClass08 {
    void method () {
        System.out.println("부모의 메소드!");
    }
}
class MySubClass081 extends MyClass08{
    @Override
    void method () {
        System.out.println("자식의 메소드!");
        super.method();

        // super: 부모의 멤버에 접근할 때 사용하는 키워드
    }

}