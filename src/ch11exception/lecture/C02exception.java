package ch11exception.lecture;

public class C02exception {
    public static void main(String[] args) {
        System.out.println("code1...");
        System.out.println("code2...");

        int[] arr = {1, 2};
        int i = arr[2]; //ArrayIndexOutOfBoundsException

        System.out.println("code3...");
    }
}
