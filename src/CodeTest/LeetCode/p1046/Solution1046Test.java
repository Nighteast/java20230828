package CodeTest.LeetCode.p1046;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1046Test {

    @Test
    void lastStoneWeight() {
        Solution1046 o1 = new Solution1046();
        int result1 = o1.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        assertEquals(1,result1);

        Solution1046 o2 = new Solution1046();
        int result2 = o2.lastStoneWeight(new int[]{1,1});
        assertEquals(0,result2);

    }
}