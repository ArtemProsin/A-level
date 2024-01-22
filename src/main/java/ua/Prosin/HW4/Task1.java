package ua.Prosin.HW4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        int[] array = generateRandomArray(400, 1, 10);
        double aritfmeticMean = calculateArithmeticMean(array);
        System.out.println("arithmetic" + aritfmeticMean);
        double geometricMean = calculateGeometricMean(array);
        System.out.println("geometric" + geometricMean);
        }



    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static double calculateArithmeticMean(int[] array) {
        int sum = 0;
        for(int value : array){
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        int product = 1;
        for(int value : array){
            product *= value;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}




