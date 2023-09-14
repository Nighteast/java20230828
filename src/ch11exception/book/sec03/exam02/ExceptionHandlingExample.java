package ch11exception.book.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("value = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("e = " + e);
            } catch (Exception e) {
                System.out.println("e = " + e);
            }
        }

    }
}
