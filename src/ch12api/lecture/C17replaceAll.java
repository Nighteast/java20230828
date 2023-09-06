package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        // replace All : 특정 패턴 -> 다른 문자열로 변경
        String a = "JAVA is java";
        String t = a.replace("java", "python");
        System.out.println("t = " + t);

        String t2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println("t2 = " + t2);
    }
}
