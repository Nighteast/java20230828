package ch16lambda.book.exercise.p07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrMin((x, y) -> (x < y) ? y : x);
        System.out.println("max = " + max);

        //최소값 얻기
        int min = maxOrMin((x, y) -> (x > y) ? y : x);
        System.out.println("min = " + min);
    }
}
