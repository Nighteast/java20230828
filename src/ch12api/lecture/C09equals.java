package ch12api.lecture;

public class C09equals {
    public static void main(String[] args) {
        Object o1 = new String("java");
        Object o2 = new String("spring");
        Object o3 = new String("java");

        System.out.println(o1 == o2);       //false
        System.out.println(o1 == o3);       //false

        //문자열 비교 (String 비교는 equals 사용) 놓쳐서 버그생기는 경우 많다고 함.
        System.out.println(o1.equals(o2));  //false
        System.out.println(o1.equals(o3));  //true
    }
}
