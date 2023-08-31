package CodeTest.lv0.RemovingVowels;

public class RemovingVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Hello, World"));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);

        char[] c = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < c.length; i++) {
            int index = sb.indexOf(String.valueOf(c[i]));
            while (index != -1) {
                sb.deleteCharAt(index);
                index = sb.indexOf(String.valueOf(c[i]));
            }
        }

        return sb.toString();
    }
}
// 모음 캐릭터 배열을 만든다.
// 모음 배열 0~4까지 for문으로 돈다.
// a일 경우 while문으로 indexOf로 index값이 -1이 나올때까지 중복을 제거한다.
// => while(true)일 경우 계속 돌아가니까 while(index != -1)  -> index == -1 일경우 false로 멈춤
// (StringBuffer.indexOf 는 해당하는 문자가 없으면 -1을 반환한다.)
// a를 전부 제거한다.
// 이하 반복...
// e를 전부 제거한다.
// i를 전부 제거한다.
// o를 전부 제거한다.
// u를 전부 제거한다.
