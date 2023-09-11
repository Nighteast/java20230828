package CodeTest.LeetCode.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                //처음이 아닐때
                map.put(num, map.get(num) + 1);
            } else {
                //처음일때
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}
