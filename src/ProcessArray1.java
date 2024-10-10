package src;
import java.util.Arrays;

public class ProcessArray1 {

    public static void processArray1() {
        int[] array = initializeArray();
        printArray1("Исходный массив:", array);
        array = arraySwitch(array);
        printArray1("Измененный массив:", array);
    }

    public static int[] initializeArray() {
        return new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0};
    }

    public static void printArray1(String message, int[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    public static int[] arraySwitch(int[] array) {
        int[] switchedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            switchedArray[i] = array[array.length - 1 - i];
        }
        return switchedArray;
    }
}

