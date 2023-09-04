package Tistory.java.StringMethod;

public class test {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);
        System.out.println(charArray[3]);
        System.out.println(charArray[4]);


        String str2 = "abc";
        String repeated = str2.repeat(3);
        System.out.println(repeated);
        // repeated는 "abcabcabc"가 됩니다.
        char c = 'a';
        String repeated2 = (c+"").repeat(3);
        System.out.println(repeated2);
        // 응용! char c에 ""을 합연산 해주어 String으로 형변환하여서 repeat를 사용하기.

        StringBuilder sb = new StringBuilder("Hello");
        String result = sb.toString();
        System.out.println(result);
        // result는 "Hello"가 됩니다.

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World!");
        String result2 = sb2.toString();
        System.out.println(result2);
        // result는 "Hello World!"가 됩니다.

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.setLength(3);
        String result3 = sb3.toString();
        System.out.println(result3);
        // result는 "Hel"이 됩니다.

        StringBuilder sb4 = new StringBuilder("Hello");
        char[] charArray2 = new char[5];
        sb4.getChars(0, 5, charArray2, 0);
        System.out.println(charArray2);
        // charArray는 "Hello"의 문자 배열입니다.



    }
}
