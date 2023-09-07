package CodeTest.Programers.FrectionAddiction;

class MainSolution {
    public static void main(String[] args) {
        String s = new Solution().toString();
        System.out.println();
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        solution(1,2,1,4);  // 정답은 3/4
        int[] answer = new int[2];
        return answer;
    }
}

//denom1, denom2 의 최소공배수 구하기
//둘중 작은 수에 분모에 최소공배수까지 곱하기
//