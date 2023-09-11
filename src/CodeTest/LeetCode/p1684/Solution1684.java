package CodeTest.LeetCode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedCharSet = new HashSet<>();

        for (char allowedChar : allowed.toCharArray()) { //allowed의 char를 전체 탐색
            allowedCharSet.add(allowedChar); //allowedSet에 입력해준다.
        }

        int result = 0; // 결과값 선언 및 초기화

        for (String word : words) {  // words의 문자열을 전체 탐색한다.
            int count = 1;  // 포함된 결과값을 count해줄 변수 임시 선언
            for (char wordChar : word.toCharArray()) { // word의 문자열의 char를 전체 탐색한다.
                if (!allowedCharSet.contains(wordChar)) { // allowedCharSet에 포함되어있지 않다면
                    count = 0; //count 하지 않는다.
                    break; //동시에 즉시 wordChar for문을 빠져나간다. -> 다른 word탐색
                }
            }
            result += count; //wordChar 탐색 중 break를 만나지 않았다면 결과값에 count를 더해준다.
        }
        return result;
    }
}
