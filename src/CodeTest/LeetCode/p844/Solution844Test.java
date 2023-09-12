package CodeTest.LeetCode.p844;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution844Test {

    @Test
    void backspaceCompare() {
        Solution844 o = new Solution844();
        assertEquals(true, o.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, o.backspaceCompare("ab##", "c#d#"));
        assertEquals(false, o.backspaceCompare("a#c", "b"));
        assertEquals(false, o.backspaceCompare("a##c", "#a#c"));
    }
}