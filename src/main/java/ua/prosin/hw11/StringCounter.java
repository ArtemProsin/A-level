package ua.prosin.hw11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCounter {
    public static Map<String, Integer> countString(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String item = strings.get(i);
            Integer latters = item.length();
            result.put(item, latters);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("her");
        strings.add("HI");
        strings.add("when");

        Map<String, Integer> result = StringCounter.countString(strings);
        System.out.println(result);
    }
}
