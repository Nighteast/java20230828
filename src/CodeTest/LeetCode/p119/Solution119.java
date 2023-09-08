package CodeTest.LeetCode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public static void main(String[] args) {
        Solution119 o1 = new Solution119();
        o1.getRow(3);
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1);

        for (int c = 0; c < rowIndex; c++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev_row = tri.get(c);
            row.add(1);

            for (int i = 1; i < prev_row.size(); i++) {
                row.add(prev_row.get(i - 1) + prev_row.get(i));
            }

            row.add(1);
            tri.add(row);
        }
        return tri.get(rowIndex);
    }
}
