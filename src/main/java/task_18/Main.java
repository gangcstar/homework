package task_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        //добавляем 20 случайных чисел и выводим результат
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(20));
        }
        System.out.println(numbers);
        System.out.println();


        //выполняем сортировку и выводим
        Collections.sort(numbers);
        System.out.println(numbers);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println();
        System.out.println(numbers);


    }
}
