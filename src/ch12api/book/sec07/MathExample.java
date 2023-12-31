package ch12api.book.sec07;

public class MathExample {
    public static void main(String[] args) {
        // 큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        // 큰값 또는 작은값 얻기
        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        // 소수 이하 두 자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;         // 100 곱해서 소수점 2자리까지 이동 -> 1234.56
        long temp2 = Math.round(temp1);     // round를 통해 반올림 -> 1235
        double v5 = temp2 / 100.0;          // 100.0을 나눠서 다시 원래 소수점으로 이동 12.35
        System.out.println("v5 = " + v5);   // 소수 이하 두 자리 완성

    }
}
