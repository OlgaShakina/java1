package src;

public class CheckSumSign {
    public static void checkSumSign() {
        int a = -3;
        int b = -1;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
}
