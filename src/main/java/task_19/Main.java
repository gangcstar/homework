package task_19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("яблоки", 5);
        map.put("груши", 8);
        map.put("бананы", 2);

        map.forEach((key, value) -> System.out.println(key + " - " + value + "шт."));
    }
}
