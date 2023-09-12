package ch17stream.book.sec05;

import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("홍길동");    list.add("신용권");
//        list.add("김자바");    list.add("신용권");    list.add("신민철");
        var list = List.of("홍길동", "신용권", "김자바", "신용권", "신민철");

        System.out.println("중복 제거 후 출력");
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("'신'으로 시작하는 요소만 출력");
        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("중복 제거 후 '신'으로 시작하는 요소만 출력");
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
