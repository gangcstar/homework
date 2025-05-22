package task_21;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("яблоки", 5);
        map.put("груши", 8);
        map.put("бананы", 2);

        map.forEach((key, value) -> System.out.println(key + " - " + value + "шт."));
        System.out.println();


        //по ключу
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();


        //по значению
        for (Integer value : map.values()) {
            System.out.println("Значение: " + value);
        }
        System.out.println();


        //entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
