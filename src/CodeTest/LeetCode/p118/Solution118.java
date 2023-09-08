package CodeTest.LeetCode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static void main(String[] args) {
        Solution118 o1 = new Solution118();
        o1.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.get(0).add(1);
        System.out.println(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = list.get(i - 1);

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }

            row.add(1);

            list.add(row);
        }


        return list;
    }
}
