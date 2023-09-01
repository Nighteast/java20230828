package ch08interface.book.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2 종속 코드");
        defaultCommon();
    }


    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드 A");
        System.out.println("defaultMethod 중복 코드 B");
    }

    static void staticMethod1() {
        System.out.println("Service.staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("Service.staticMethod2 종속 코드");
        staticCommon();
    }

    static void staticCommon() {
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }
}
