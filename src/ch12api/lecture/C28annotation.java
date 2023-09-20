package ch12api.lecture;

@MyAnnotation
public class C28annotation {
    @MyAnnotation
    private int field;

    public static void main(@MyAnnotation String[] args) {
        @MyAnnotation
        int value = 3;
    }
}

@interface MyAnnotation {

}
