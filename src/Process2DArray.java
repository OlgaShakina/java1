package src;

public class Process2DArray {
    public static void fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }
    public static int[][] create2DArray(int n) {
        return new int[n][n];
    }
}


