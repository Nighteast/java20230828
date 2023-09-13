package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//static import
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class C23collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html");

        // 스트링 리스트의 글자 길이를 인티저리스트로 받고 싶다.
        // 고전적인 방법
        List<Integer> res1 = new ArrayList<>();
        for (String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);

        //collect를 사용하는 방법
        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(toList());
        System.out.println("res2 = " + res2);

        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(toSet());
        System.out.println("res3 = " + res3);

        Map<String, Integer> res4 = list.stream()
                .collect(toMap(x -> x, String::length));
        System.out.println("res4 = " + res4);

        Map<String, Integer> res5 = list.stream()
                .collect(toMap(identity(), String::length));
        System.out.println("res5 = " + res5);
    }
}
