package ch06class;

public class C08static {
    public static void main(String[] args) {
//        MyClass08 o1 = new MyClass08();
//        o1.name = "java";
//        o1.printName();

        // static member는 클래스 이름으로 바로 접근하세요.
        // instance가 없어도 클래스명으로만 접근 가능.
        MyClass08.name = "spring";
        MyClass08.printName();
    }
}
class MyClass08 {
    // static field + static method = static member
    static String name;
    static void printName() {
        System.out.println("name = " + name);
    }
}