package CodeTest.lv0.discount;

public class Discount {
    public static void main(String[] args) {
        int answer = 0;
        Solution solution = new Solution();
        answer = solution.solution(100000);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int price) {
        if (300000 > price && price >= 100000)
            return (int) (price * 0.95);
        else if (500000 > price && price >= 300000)
            return (int) (price * 0.90);
        else if (price >= 500000)
            return (int) (price * 0.80);
        return price;
    }
}