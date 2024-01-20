package ua.Prosin.HW3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whrite here");
        String inputString = scanner.nextLine();
        int wordCount = countWords(inputString);
        System.out.println(wordCount);
        scanner.close();
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}
