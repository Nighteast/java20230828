package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); // public static 메서드 실행
        MyInterface14.method2();
//        MyInterface14.common();  // private 메서드 직접접근 불가능
    }
}

interface MyInterface14 {
    // 필드 : public static final

    // 인스턴스 메서드
    // 추상 메서드
    // default 메서드
    // private 메서드

    // static(정적) 메서드
    //  public static 메서드
    //  private static 메서드

    static void method() {
        // public static 메서드
        System.out.println("MyInterface14.method");
    }

    static void method2() {
        System.out.println("MyInterface14.method2");
    }

    private static void common() {
        System.out.println("어떤 기능1");
    }
}
