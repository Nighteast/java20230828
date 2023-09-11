package CodeTest.LeetCode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;

        for (String s : words) {
            int tmp = 1;
            for (char c : s.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    tmp = 0;
                    break;
                }
            }
            count += tmp;
        }
        return count;
    }
}
