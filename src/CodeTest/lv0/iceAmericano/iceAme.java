package CodeTest.lv0.iceAmericano;

public class iceAme {
    public static void main(String[] args) {

    }
}


class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
