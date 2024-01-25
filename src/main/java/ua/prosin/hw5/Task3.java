package ua.prosin.hw5;


public class Task3 {

    public static void main(String[] args) {
        int[][] array = {{4, 5}, {6, 3}};

        System.out.println("Original array:");
        printArray(array);

        int[][] transformedArray = swapRowsAndColumns(array);

        System.out.println("Array after transformation:");
        printArray(transformedArray);
    }

    private static int[][] swapRowsAndColumns(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;

        int[][] newArray = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                newArray[j][i] = array[i][j];
            }
        }

        return newArray;
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

