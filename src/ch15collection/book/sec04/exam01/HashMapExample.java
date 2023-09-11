package ch15collection.book.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);  // 키가 같기 떄문에 제일 마지막에 저장한 값만 저장. (있다면 교체)
        System.out.println("map.size() = " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // + 향상된 for
        System.out.println("향상된 for문 사용하여 전체탐색");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        // + forEach
        System.out.println("forEach 메서드로 전체탐색");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();


        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());
        System.out.println();



    }
}
