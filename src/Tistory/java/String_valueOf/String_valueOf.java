package Tistory.java.String_valueOf;

public class String_valueOf {
    public static void main(String[] args) {
        //기본형 선언
        int a = 1;
        char b = '가';
        long c = 1234567890000L;
        float d = 3.333F;
        double e = 1.23456789000;
        boolean f = true;

        // valueOf 메서드를 사용해 각각 String으로 형변환하여 출력한다.
        System.out.println("String.valueOf(a) = " + String.valueOf(a));
        System.out.println("String.valueOf(b) = " + String.valueOf(b));
        System.out.println("String.valueOf(c) = " + String.valueOf(c));
        System.out.println("String.valueOf(d) = " + String.valueOf(d));
        System.out.println("String.valueOF(e) = " + String.valueOf(e));
        System.out.println("String.valueOf(f) = " + String.valueOf(f));

        System.out.println(a + d);
        // int형 + float형 = float형 으로 출력된다.
        System.out.println(String.valueOf(a) + String.valueOf(d));
        // String형 + String형 = 문자열끼리의 이어붙이기가 출력된다.

    }
}
