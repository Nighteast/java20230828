package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        String a = "spring";

        int index = a.indexOf("ring");  //2
        System.out.println(index);

        System.out.println(a.indexOf("pr"));    // 1

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));  // 2

        int index1 = b.indexOf("ring", 2);          // 2
        System.out.println(index1);

        System.out.println(b.indexOf("ring",3));    //12
    }
}
