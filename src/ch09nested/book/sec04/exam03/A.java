package ch09nested.book.sec04.exam03;

public class A {
    public void method1(int arg) {  //final int arg
        int var = 1;                //final int var = 1;

        class B {
            void method2() {
                //로컬 변수 읽기
                System.out.println("arg = " + arg); //(O)
                System.out.println("var = " + var); //(O)

                //로컬 변수 수정 x
//                arg = 2;  //(X)
//                var = 2;  //(X)
            }
        }

        B b = new B();
        b.method2();

        //로컬 변수 수정 x
//        arg = 3;  //(X)
//        var = 3;  //(X)
    }
}
