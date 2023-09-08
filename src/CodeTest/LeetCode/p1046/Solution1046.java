package CodeTest.LeetCode.p1046;

import java.util.*;

public class Solution1046 {
    public static void main(String[] args) {
        Solution1046 o1 = new Solution1046();
        o1.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
    }

    public int lastStoneWeight(int[] stones) {
/** 내가 한거
 // intArray to ArrayList
 List<Integer> list = new ArrayList<>();

 for (int stone : stones) {
 list.add(stone);
 }

 // list
 // sort, remove, add, size
 System.out.println(list);

 // ArraysList 정렬
 Collections.sort(list);
 System.out.println(list);

 while (!list.isEmpty()) {
 if(list.size() == 1) {
 break;
 }
 Collections.sort(list);
 int maxIndex = list.size()-1;
 int maxIndex2 = list.size()-2;
 list.add(list.get(maxIndex)-list.get(maxIndex2));
 list.remove(maxIndex);
 list.remove(maxIndex2);
 //            System.out.println(list);
 }
 //        System.out.println(list);

 return list.get(0);*/

        //강사님꺼
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        // list
        // sort, remove, add, size

        // [2, 7, 4, 1, 8, 1]

        // 1.sort
        // [8, 7, 4, 2, 1, 1]

        // 2.remove
        // [4, 2, 1, 1]

        // 3.add
        // [4, 2, 1, 1, 1]

        // 1.sort
        // [4, 2, 1, 1, 1]

        // 2.remove
        // [1, 1, 1]

        // 3.add
        // [1, 1, 1, 2]

        // 1.sort
        // [2, 1, 1, 1]

        // 2.remove
        // [1, 1]

        // 3.add
        // [1, 1, 1]

        // 1.sort
        // [1, 1, 1]

        // 2.remove
        // [1]

        // 3.add
        // [1]


        while (list.size() > 1) {
            // 1.sort
            list.sort((o1, o2) -> o2 - o1);

            // 2.remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);

            // 3.add
            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }

        }

        if (list.size() == 1) {
            return list.get(0);
        }

        return 0;
    }
}


