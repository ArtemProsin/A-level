package ua.prosin.hw3;

public class Task2 {
    public static void main(String[] args) {
        String originalString = "A man a plan a canal Panama";
        String stringWithoutSpace = originalString.replaceAll("\\s", "");

        if (isPalindrome(stringWithoutSpace)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static boolean isPalindrome(String str){
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedString);
    }
}
