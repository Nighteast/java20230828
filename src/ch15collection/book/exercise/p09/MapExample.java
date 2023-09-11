package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            totalScore += entry.getValue();
            if (maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("평균점수 : " + totalScore/entries.size());
        System.out.println("최고점수 : " + maxScore);
        System.out.println("최고점수 아이디 : " + name);
    }
}
