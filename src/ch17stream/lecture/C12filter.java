package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3, 1, 4, 9, 10, 33, 2);

        list.stream()
                .filter(e -> true) // true가 나올때만 다음 스트림으로 전달
                .forEach(System.out::println);

        System.out.println();
        System.out.println("홀수만 남기기");
        list.stream()
                .filter(e -> e % 2 == 1)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("짝수만 남기기");
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("짝수 중 가장 작은 값 출력");
        list.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("홀수 중 가장 큰 값 출력");
        list.stream()
                .filter(e -> e % 2 == 1)
                .sorted((x, y) -> y - x)
                .limit(1)
                .forEach(System.out::println);
    }
}
