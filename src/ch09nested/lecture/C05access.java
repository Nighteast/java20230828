package ch09nested.lecture;

public class C05access {

    String name = "java";

    class InnerClass {
        String name = "spring";

        void method() {
            System.out.println(name);       //inner class의 name
            System.out.println(this.name);  //inner class의 name
            System.out.println(C05access.this.name);    //C05access의 name
        }
    }

    public static void main(String[] args) {
        C05access o2 = new C05access();
        InnerClass o1 = o2.new InnerClass();
        o1.method();
    }
}
