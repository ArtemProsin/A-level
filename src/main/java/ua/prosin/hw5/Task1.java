package ua.prosin.hw5;

public class Task1 {
    public static void main(String[] agrs){
         int numRows = 4;
         int numCols = 3;
         int[][] originalArray = createArray(numRows, numCols);
         printArray("source array", originalArray);
         int[][] newArray = fillArrayWithIndex(originalArray);
         printArray("new array", newArray);
    }
    private static int[][] fillArrayWithIndex(int[][]array){
        int[][] newArray = new int[array.length][array[0].length];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                newArray[i][j] = (i % 2 == 0) ? value : -value;
                value++;
            }
        }
        return newArray;
    }
    private static int[][] createArray(int numRows, int numCols){
        return new  int[numRows][numCols];
    }

    public static void printArray(String massage, int[][] array){
        System.out.println(massage);
        for (int[] row : array){
            for (int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
