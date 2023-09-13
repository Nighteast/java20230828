package ch17stream.lecture;

import java.util.List;

public class C21reference {
    public static void main(String[] args) {
        var list1 = List.of("java", "spring", "css");
        Integer length = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();
        System.out.println("length = " + length);

        //참조타입 stream -> 기본타입 stream
        //mapToInt, mapToLong, mapToDouble
        int sum = list1.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);


    }
}
