package ua.prosin.hw5;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {66, 4, 1, 10, 2, 55, 15, 11, 9};

        System.out.println("Original array:");
        printArray(array);

        boolean isOrdered = checkArrayDescendingOrder(array);

        System.out.println("Array is ordered in descending order: " + isOrdered);
    }

    private static boolean checkArrayDescendingOrder(int[] array) {
        int[] copyArray = copyArray(array);

        for (int i = 1; i < copyArray.length; i++) {
            if (copyArray[i - 1] < copyArray[i]) {
                return false;
            }
        }

        System.out.println("Array after operation:");
        printArray(copyArray);

        return true;
    }

    private static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];

        System.arraycopy(array, 0, copy, 0, array.length);

        return copy;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
