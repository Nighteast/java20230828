package ch14thread.lecture;

public class C11concurrency {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.print("-");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.print("|");
            }
        });
        t2.start();
    }
}
