package src;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PrintThreeWords.printThreeWords();
        CheckSumSign.checkSumSign();
        PrintColor.printColor();
        CompareNumbers.compareNumbers();
        boolean result = CheckSumRange.checkSumRange(5, 15);
        System.out.println("Сумма в пределах от 10 до 20: " + result);
        CheckNumberSign.checkNumberSign(5);
        System.out.println(IsNegative.isNegative(-5));
        PrintString.printString("Hi There!", 3);
        System.out.println("Is 2024 a leap year?"+ IsLeapYear.isLeapYear(2024));
        ProcessArray1.processArray1();

        int[] filledArray = ProcessArray2.processArray2();
        System.out.println(Arrays.toString(filledArray));
        ProcessArray3.processArray3();

        int n = 5;
        int[][] array = Process2DArray.create2DArray(n);
        Process2DArray.fillDiagonal(array);
        System.out.println(Arrays.deepToString(array));
        ProcessInitializedArray.processInitializedArray();
    }
}
