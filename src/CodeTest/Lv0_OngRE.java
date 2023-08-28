package CodeTest;

public class Lv0_OngRE {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        return answer;
    }
}

/*
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 15
babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
문자열은 알파벳 소문자로만 이루어져 있습니다.

babbling[i] 배열에 들어있는 15개의 랜덤 문자열이 나온다.
ORE[] = {"aya", "ye", "woo", "ma"} 가 포함되어 있는지 확인
ORE의 문자가 포함되어 있지 않다. -> 발음 불가
ORE의 문자가 포함되어 있다. -> 발음 가능

    1. ORE[] = {"aya", "ye", "woo", "ma"} 선언하기.
    2. babbling[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa", "mmaa"] 테스트용 선언하기 (Solution class)
    3. babbling[i]로 for문 돌리기.
    4. ORE[i]로 for문 돌리기.
    4-1. if문을 통해 babbling[i]가 ORE[0~3]까지 포함되어있는지 확인
    4-2 포함되어 있다면 babbling[i]의 겹치는 단어를 .으로 대체

그러나 maa의 경우 ma가 포함되어있지만 a가 없음 -> 발음불가

그렇다면 아래와 같이 조건 설정 한다.
ORE가 1개 이상 포함되어있음 && 그 외의 남는 문자가 없음 -> 발음가능
ORE가 1개 이상 포함되어있음 && 그 외의 남는 문자가 있음 -> 발음불가

mmaa 의 경우 ma가 삭제되면 ma가 남아서 발음가능하다고 할 수 있어 오류가 발생 할 수 있다.
따라서 babbling의 각 배열을 순서대로 가져와서 ORE와 중복되는것을 .으로 대체한다

이후 babbling[i].length >= 1 -> 발음 불가
이후 babbling[i].length = 0 -> 발음 가능

babbling[i].length = 0일때 answer += 1 한다.*/
