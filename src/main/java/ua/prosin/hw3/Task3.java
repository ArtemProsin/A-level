package ua.prosin.hw3;

import java.util.Scanner;

public class Task3 {
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
        int nonEmptyWordCount = 0;
        for (String word : words){
            if (!word.isEmpty()){
               nonEmptyWordCount++;
            }
        }
        return nonEmptyWordCount;
    }
}
