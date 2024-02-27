package ua.prosin.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Element {
    public static void fillInList(List<Integer> list){
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static List<Integer> getRandomElement(List<Integer> list){
        List<Integer> result = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            Integer number = list.get(randomIndex);
            result.add(number);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> linked = new LinkedList<Integer>();

        long start = System.currentTimeMillis();
        fillInList(array);
        List<Integer> randomElement = getRandomElement(array);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time for ArrayList: " + timeElapsed);

        long startLinked = System.currentTimeMillis();
        fillInList(linked);
        List<Integer> randomElement1 = getRandomElement(linked);
        long finishLinked = System.currentTimeMillis();
        long timeElapsed2 = finishLinked - startLinked;
        System.out.println("Time for LinkedList: " + timeElapsed2);
    }
}
