package CodeTest.LeetCode.p1512;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1512re {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
//        System.out.println("map = " + map);

//        map.entrySet()
//                .stream()
//                .map(e->e.getValue())
//                .forEach(System.out::println);

        map.values()
                .stream().map(n -> (n) * (n - 1) / 2)
                .mapToInt(n -> n.intValue())
                .sum();

        return 0;
    }
}
