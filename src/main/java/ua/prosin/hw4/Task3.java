package ua.prosin.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(2000, 1, 10);
        int[] originalArray = Arrays.copyOf(array, array.length);
        replaceEvenWithZeros(array);
        System.out.println("sours array");
        printArray(originalArray);
        System.out.println("even with zeros");
        printArray(array);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void replaceEvenWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
