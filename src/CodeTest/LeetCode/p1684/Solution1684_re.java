package CodeTest.LeetCode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution1684_re {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int result = 0;

        for (String s : words) {
            boolean b = true;
            for (char c : s.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    b = false;
                    break;
                }
            }
            result++;
        }

        return result;
    }
}
