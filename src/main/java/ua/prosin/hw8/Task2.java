package ua.prosin.hw8;

@FunctionalInterface
interface Pow {
    int pow(int number, int pow);
}

public class Task2 {
    public static void main(String[] args) {
        Pow power = (number, pow) -> {
            int result = number;
            for (int i = 1; i < pow; i++) {
                result *= number;
            }
            return result;
        };
        int result = power.pow(4, 2);
        System.out.println(result);
    }
}
