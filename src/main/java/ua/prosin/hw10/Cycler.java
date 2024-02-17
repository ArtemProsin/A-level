package ua.prosin.hw10;

import java.util.ArrayList;
import java.util.Iterator;

public class Cycler {

    public void forCycle(ArrayList<Integer> array) {

        System.out.println("List item forCycle");

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    public void forEachCycle(ArrayList<Integer> array) {

        System.out.println("List item forEachCycle");

        for (Integer item : array) {
            System.out.print(item + " ");
        }
    }

    public void whileCycle(ArrayList<Integer> array) {

        System.out.println("List item whileCycle");

        int counter = 0;
        while (counter < array.size()) {
            System.out.print(array.get(counter) + " ");
            counter++;
        }
    }

    public void iteratorCycle(ArrayList<Integer> array) {

        System.out.println("List item iteratorCycle");

        Iterator<Integer> iterator;
        iterator = array.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(4);
        array.add(8);
        array.add(8);

        Cycler cycler = new Cycler();
        cycler.forCycle(array);
        System.out.println();
        cycler.forEachCycle(array);
        System.out.println();
        cycler.iteratorCycle(array);
        System.out.println();
        cycler.whileCycle(array);
        System.out.println();
        array.forEach(System.out::print);
    }
}
