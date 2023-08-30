package Tistory.test;

public class Test {

}

class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n % 7 == 0)
            answer = n / 7;
        else if(n % 7 != 0) {
            answer = n / 7;
            answer += 1;
        }
        return answer;
    }
}


//올림 나눗셈 사용
class Solution2 {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}

class Solution3 { //문자열 뒤집기
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = String.valueOf(sb.reverse());
        return answer;
    }
}