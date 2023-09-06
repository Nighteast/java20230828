package ch12api.book.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "SAngel100411";
        String regExp = "[a_zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch = id.matches(regExp);
        boolean isMatch2 = Pattern.matches(regExp, id);

        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
