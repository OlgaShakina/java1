package src;

import java.util.Arrays;

public class ProcessArray3 {
    public static void processArray3() {
        int[] array = initializeArray();
        processArray3("Исходный массив:", array);
        array = arrayMultiply(array);
        processArray3("Измененный массив:", array);
    }

    public static int[] initializeArray() {
        return new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    }

    public static void processArray3(String message, int[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    public static int[] arrayMultiply(int[] array) {
        int[] switchedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                switchedArray[i] = array[i] * 2;
            } else {
                switchedArray[i] = array[i];
            }
        }
        return switchedArray;
    }
}
