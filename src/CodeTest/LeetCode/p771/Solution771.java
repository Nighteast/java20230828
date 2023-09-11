package CodeTest.LeetCode.p771;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        // jewels : "aA"
        // stones : "aAAbbbb"

        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }
        int result = 0;
//        for (int i = 0; i < stoneArray.length; i++) {
//            if (jewelSet.contains(stoneArray[i])) {
//                result += 1;
//            }
//        }
        for(char c : stones.toCharArray()) {
            if(jewelSet.contains(c)) {
                result++;
            }
        }

        return result;
    }
}

class MyClass771 {
    public static void main(String[] args) {
        Solution771 o1 = new Solution771();
        System.out.println(o1.numJewelsInStones("aA", "aAAbbbb"));
    }
}