package src;

public class CheckSumRange {
    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
