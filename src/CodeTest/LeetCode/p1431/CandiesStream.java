package CodeTest.LeetCode.p1431;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class CandiesStream {
}
class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 배열에서 최대값 구하기
        int max = stream(candies)
                .max()
                .getAsInt();

        // max와 값비교
        return Arrays.stream(candies)
                .map(c -> c + extraCandies)
                .mapToObj(c -> c >= max)
                .toList();
    }
}
