package src;

public class ProcessInitializedArray {
    public static void processInitializedArray() {
        int[] array = initializeArray(5, 7);
        printArray("Массив:", array);
    }
    public static int[] initializeArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void printArray(String message, int[] array) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
