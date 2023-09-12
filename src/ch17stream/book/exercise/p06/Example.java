package ch17stream.book.exercise.p06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
//        List<Member> list = Arrays.asList(
//                new Member("홍길동", 30),
//                new Member("신용권", 40),
//                new Member("김자바", 26)
//        );
        var list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        // map 중간연산을 사용해서 Member의 나이들을 출력해보세요.
        System.out.println("나이들만 출력");
        list.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);

        // reduce를 사용하여
        System.out.println("나이들의 합 구해서 출력");
        Integer reduce = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        System.out.println("나이 합 = " + reduce);

        // 가장 많은 나이 reduce로 구해서 출력
        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer reduce1 = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("왕고 = " + reduce1);

        // 가장 작은 나이 reduce로 구해서 출력
        System.out.println("가장 작은 나이 reduce로 구해서 출력");
        Integer reduce2 = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("막내 = " + reduce2);

        // 기타
        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average().orElse(0);
        System.out.println("평균 = " + avg);
    }
}
