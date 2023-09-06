package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        // replace : 특정 문자열 -> 다른 문자열로 변경
        String a = "spring";
        String t = a.replace("sp", "abc");

        System.out.println("a = " + a);     // return 해주기 떄문에 원본은 바뀌지 않음.
        System.out.println("t = " + t);     // 원본 대입한 값

        String b = "java is java";
        String t2 = b.replace("java", "python");
        System.out.println("t2 = " + t2);

        String c = "JAVA is java";
        String t3 = c.replace("java", "html");      // 대소문자 구분한다.
        System.out.println("t3 = " + t3);
    }
}
