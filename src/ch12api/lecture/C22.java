package ch12api.lecture;

public class C22 {
    public static void main(String[] args) {
        Integer i = 3000;
        Integer j = 3000;

        int k = 30;
        int l = 30;

        System.out.println(k == l);
        System.out.println(i == k); // 참조값

        System.out.println(i.equals(j));  // 참조타입 비교는 equals

        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(j));
    }
}
