package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        // lambda
        // ( 파라미터 목록 ) -> { 메서드 몸통 };
        MyInterface02 o1 = new MyInterface02() {
            @Override
            public void method() {
                System.out.println("C021lambda.method");
            }
        };

        // 메서드 몸통의 코드가 한 줄이면 중괄호 생략 가능
        MyInterface02 o2 = () -> System.out.println("메서드 내 코드가 한 줄일 경우 중괄호 생략가능");

        o1.method();
        o2.method();
    }
}

@FunctionalInterface
interface MyInterface02 {
    // 파라미터 없는 메서드
    // 리턴 없음
    void method();

}