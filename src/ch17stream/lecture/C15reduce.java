package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        // reduce
        //
        var list = List.of(5, 1, 3);
        Integer reduce = list.stream()
                .reduce(0, (r, e) -> 0);

        System.out.println("reduce = " + reduce);

//        r = 이전 결과(return)값, e = 원소
//        apply(0, 5);
//        apply(0, 1);
//        apply(0, 3);

        System.out.println("모든 값 더하기");
        Integer reduce1 = list.stream()
                .reduce(0, (r, e) -> r + e);
        System.out.println("reduce1 = " + reduce1);

//        [5, 1, 3]
//        apply(0, 5); -> 5
//        apply(5, 1); -> 6
//        apply(6, 3); -> 9


    }
}
