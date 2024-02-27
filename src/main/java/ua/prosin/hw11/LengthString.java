package ua.prosin.hw11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthString {
    public static Map<Integer, List<String>> groupByLenght(List<String> strings) {
        Map<Integer, List<String>> result = new HashMap<>();

        for (int i = 0; i < strings.size(); i++) {
            String item = strings.get(i);
            Integer key = item.length();
            if (result.containsKey(key)) {
                List<String> prevItem = result.get(key);
                prevItem.add(item);
                result.put(key, prevItem);
            }else {
                ArrayList<String> localArray = new ArrayList<>();
                localArray.add(item);
                result.put(key, localArray);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("go");
        strings.add("join");
        strings.add("hi");
        strings.add("blink");

        Map<Integer, List<String>> result = LengthString.groupByLenght(strings);
        System.out.println(result);
    }
}
