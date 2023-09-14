package ch11exception.lecture;

public class C23custom {
    public static void main(String[] args) {
        int money = 300;

        if (money < 10000) {
            throw new LackOfMoneyException();
        }
    }

}

class LackOfMoneyException extends RuntimeException { // unchecked, checked를 선택하여 상속받는다.
    public LackOfMoneyException() {
    }

    public LackOfMoneyException(String message){
        super(message); //상위 타입(RuntimeException) 부모의 생성자 매개값으로 넘겨줘야 한다.
    }
}
