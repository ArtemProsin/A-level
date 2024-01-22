package ua.Prosin.HW4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000, 1, 100);
        int primeCount = countPrimes(array);
        System.out.println("Prime numbers " + primeCount);
    }
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static int countPrimes(int[] array) {
        int count = 0;
        for (int value : array){
            if (isPrime(value)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int number) {
        if(number < 2){
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
