package CodeTest.Programers.lv0.printCharRepetition;

public class CharRepetition {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("hello", 5));
    }

}

class Solution {
    public String solution(String my_string, int n) {
        //StringBuilder 참조변수 선언, my_string파라미터 가져옴.
        StringBuilder answer = new StringBuilder(my_string);

        // char배열을 선언, 파라미터 길이 만큼 초기화
        char[] charArray = new char[answer.length()];


        //문자열에서 문자배열로 문자복사 - getChars(복사할 문자 시작 인덱스, 복사할 문자 끝 인덱스, 문자배열, 붙여넣을 문자배열의 시작 번호)
        // 스트링빌더 answer의 값을 charArray 배열로 단일문자 각각 옮김.
        answer.getChars(0, answer.length(), charArray, 0);

        // StringBuilder answer은 다 썼으니 초기화, 이후 정답을 담을꺼임.
        answer.setLength(0);

        //for 문으로 charArray 배열의 길이 만큼 돌려서 각 단일문자에 접근
        for (int i = 0; i < charArray.length; i++) {
            char tmp = charArray[i];            // 임시적으로 단일문자를 담을 char 변수 선언
            for (int j = 0; j < n; j++) {       // 단일문자에 접근 후 n번만큼 tmp를 더해줄거임
                answer.append(tmp);             // 스트링빌더의 append를 사용해서 tmp를 n번 더함.
            }                                   // 문자배열마다 반복...
        }

        //최종적으로 StringBuilder.toString으로 String 문자열로 변환하여 리턴
        return answer.toString();
    }
}
/** 추후 알아낸 점
 * 1. charArray를 따로 선언했지만 그럴 필요가 없었다.
 *      -> my_string.toCharArray 를 사용하면 바로 CharArray를 쓸 수 있음.
 * 2. append를 2중 for문을 통해 돌렸지만 그럴 필요가 없었다.
 *      -> String.repeat라는 아주 좋은 함수가 있었다. (자바 11부터 추가)
 *      -> public String repeat(int count)
 *              Returns a string whose value is the concatenation of this string repeated count times.
 *              If this string is empty or count is zero then the empty string is returned.
 *      -> answer.append((tmp + "").repeat(n))  // (tmp + "")로 String으로 변환시켜 repeat사용
 * 3. 배열의 경우 for each 문을 사용하여 더 요약할 수 있다.
 *
 *  위를 사용하여 짧게 줄이면 이렇게 될 수 있다.
 *     class Solution {
 *     public String solution(String my_string, int n) {
 *         StringBuilder answer = new StringBuilder();
 *         for (char c : my_string.toCharArray())
 *             answer.append(String.valueOf(c).repeat(n));
 *         return answer.toString();
 *     }
 * }
 */
