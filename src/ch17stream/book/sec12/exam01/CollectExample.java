package ch17stream.book.sec12.exam01;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class CollectExample {
    public static void main(String[] args) {
        var totalList = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("김자바", "남", 95),
                new Student("오해영", "여", 93)
        );
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(toMap(Student::getName, Student::getScore));
        System.out.println(map);

    }
}
