package CodeTest;

import java.util.Arrays;

public class Lv0_ArrayCut {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2);
        return answer;
    }
}