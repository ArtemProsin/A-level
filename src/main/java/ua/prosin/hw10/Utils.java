package ua.prosin.hw10;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static int getSum(List<Integer> numbers){
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

     public static ArrayList<Integer> getOdd(List<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();
         for (int i = 0; i < numbers.size(); i++) {
             if (numbers.get(i) % 2 != 0) {
                 result.add(numbers.get(i));
             }
         }
         return result;
     }

     public static ArrayList<String> convertToStringList(List<Integer> numbers){
         ArrayList<String> result = new ArrayList<>();
         for (int i = 0; i < numbers.size(); i++) {
             result.add(numbers.get(i).toString());
         }
         return result;

     }

     public static ArrayList<String> doubling(List<String> strings){
         ArrayList<String> result = new ArrayList<>();
         for (int i = 0; i < strings.size(); i++) {
             result.add(strings.get(i).repeat(2));
         }
         return result;
     }
}
class UtilsRunner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("2i");

        System.out.println(Utils.getSum(numbers));
        System.out.println(Utils.getOdd(numbers));
        System.out.println(Utils.convertToStringList(numbers));
        System.out.println(Utils.doubling(strings));
    }
}
