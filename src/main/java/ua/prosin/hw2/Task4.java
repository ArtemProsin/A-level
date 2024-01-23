package ua.prosin.hw2;

public class Task4 {
    public static void main(String[] args) {
        double num1 = -5;
        double num2 = 7;
        double num3 = 11;
        double minAbsNumber = Math.min(Math.abs(num1), Math.min(Math.abs(num2), Math.abs(num3)));

        if (Math.abs(num1) == minAbsNumber) {
            System.out.println("Number with the smallest absolute value: " + num1);
        } else if (Math.abs(num2) == minAbsNumber) {
            System.out.println("Number with the smallest absolute value: " + num2);
        } else {
            System.out.println("Number with the smallest absolute value: " + num3);
        }
    }
}

