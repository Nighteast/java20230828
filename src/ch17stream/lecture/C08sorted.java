package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3, 1, 7, 4, 5, 10, 11, 0); //파라미터로 유추될 경우 var로 대체가능하다.
        list.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
