package ch17stream.book.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "this is a java book",
                "Lambda Expression",
                "Java8 supports lambda expressions"
        );
        list.stream()
//                .filter(n -> n.toLowerCase().contains("java".toLowerCase()))  //contains 사용
//                .filter(n -> n.toUpperCase().indexOf("JAVA") != -1)           //indexOf 사용
                .filter(n -> n.toLowerCase().matches(".*java.*"))         //matches 사용 (regex)
                .forEach(System.out::println);
    }
}
