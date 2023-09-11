package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        set.removeIf(e -> e.equals("css"));

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("jsp")) {
                iterator.remove();  // 현재 탐색하고 있는 요소 지워라
            }
        }
        System.out.println("set = " + set);
    }
}
