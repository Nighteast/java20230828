package CodeTest.LeetCode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution119new {
    public static void main(String[] args) {
        Solution119new o1 = new Solution119new();
        o1.getRow(3);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int c = 0; c < rowIndex; c++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int i = 1; i < row.size(); i++) {
                newRow.add(row.get(i - 1) + row.get(i));
            }

            newRow.add(1);

            row = newRow;
        }
        return row;
    }
}
