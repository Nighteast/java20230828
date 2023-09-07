package ch13generic.book.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int value = container2.get();
    }
}

class Container<T> {
    private T container;

    public T get() {
        return container;
    }

    public void set(T container) {
        this.container = container;
    }
}