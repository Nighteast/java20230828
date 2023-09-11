package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        // Map : key, value 쌍(entry)를 저장
        // key가 중복된 entry가 있을 수 없다.
        
        Map<String, String> map = new HashMap<>();
        
        // put : entry 추가 메서드
        map.put("student1","손흥민");
        map.put("student2","이강인");
        map.put("student3","김민재");
        
        // entry 갯수 확인 메서드
        System.out.println("map.size() = " + map.size());

        // entry 교체 메서드  put - 없으면 추가, 있으면 교체
        map.put("student3", "박지성");

        // entry 삭제 메서드
        map.remove("student2");

        // entry value를 얻는 메서드
        String s = map.get("student1");
        System.out.println("s = " + s);
        System.out.println("map.get(\"student2\") = " + map.get("student2"));
        System.out.println("map.get(\"student3\") = " + map.get("student3"));


    }
}
