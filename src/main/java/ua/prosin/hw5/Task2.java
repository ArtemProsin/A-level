package ua.prosin.hw5;

public class Task2 {

    public static void main(String[] args) {
        int[][] array = {{66, 4, 1}, {10, 2, 55}, {15, 11, 9}};

        System.out.println("Original array:");
        printArray(array);

        boolean isOrdered = checkArrayDescendingOrder(array);

        System.out.println("Array is ordered in descending order: " + isOrdered);
    }

    private static boolean checkArrayDescendingOrder(int[][] array) {
        int[][] copyArray = copyArray(array);

        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 1; j < copyArray[i].length; j++) {
                if (copyArray[i][j - 1] < copyArray[i][j]) {
                    return false;
                }
            }
        }

        System.out.println("Array after operation:");
        printArray(copyArray);

        return true;
    }

    private static int[][] copyArray(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[][] copy = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                copy[i][j] = array[i][j];
            }
        }

        return copy;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
