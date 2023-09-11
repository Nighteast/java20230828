package CodeTest.LeetCode.p1512;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1512Test {

    @Test
    void numIdenticalPairs() {
        Solution1512 o = new Solution1512();
        int i = o.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        assertEquals(4,i);
        int i1 = o.numIdenticalPairs(new int[]{1, 1, 1, 1});
        assertEquals(6,i1);
        int i2 = o.numIdenticalPairs(new int[]{1, 2, 3});
        assertEquals(0,i2);
    }
}