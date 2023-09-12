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
        System.out.println("reduce = " + reduce);

        // 기타
        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average().orElse(0);
        System.out.println("avg = " + avg);
    }
}
