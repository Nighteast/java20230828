package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x"));   //true
        System.out.println("a".matches("a"));   //true
        System.out.println("a".matches("x"));   //false

        //문자들
        System.out.println("xyz".matches("xyz"));   //true
        System.out.println("xxx".matches("xxx"));   //true
        System.out.println("xxx".matches("x"));     //false

        //수량(quantifiers)
        System.out.println("xxx".matches("x{3}"));  //true
        System.out.println("aaa".matches("a{3}"));  //true
        System.out.println("aa".matches("a{3}"));   //false
        System.out.println("aaa".matches("a{1,3}"));//true
        System.out.println("aa".matches("a{1,3}"));//true
        System.out.println("a".matches("a{1,3}"));//true

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));

        // 그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g"));      //true
        System.out.println("dododog".matches("(do){1,3}g"));    //true
        System.out.println("dog".matches("(do){1,3}g"));        //true

        // 수량 :
        System.out.println("dog".matches("do{1,}g"));       //true
        System.out.println("doog".matches("do{1,}g"));      //true
        System.out.println("dooog".matches("do{1,}g"));     //true
        System.out.println("doooog".matches("do{1,}g"));    //true
        System.out.println("dooooog".matches("do{1,}g"));   //true

        // ? : 없거나 한 번
        System.out.println("dg".matches("do?g"));       //true
        System.out.println("dog".matches("do?g"));      //true
        System.out.println("doog".matches("do?g"));     //flase

        // * : 0번 이상
        System.out.println("dg".matches("do*g"));       //true
        System.out.println("dog".matches("do*g"));       //true
        System.out.println("doog".matches("do*g"));       //true
        System.out.println("dooog".matches("do*g"));       //true
        System.out.println("doooog".matches("do*g"));       //true

        // + : 1번 이상
        System.out.println("dg".matches("do+g"));       //true
        System.out.println("dog".matches("do+g"));       //true
        System.out.println("doog".matches("do+g"));       //true
        System.out.println("dooog".matches("do+g"));       //true
        System.out.println("doooog".matches("do+g"));       //true

    }
}

