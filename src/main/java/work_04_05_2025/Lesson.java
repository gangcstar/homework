package work_04_05_2025;

import java.util.List;

public class Lesson {

    public static void main(String[] args) {
        /*
        class Box<T extends Number>{
            T item;
        }

         */

        createMyClass();

    }

    private static void createMyClass() {
        MyClass myClass = new MyClass();
        myClass.number  = 10;

        int[] numbers = new int[3]; // [0, 0, 0]
        numbers[0] = 10; // [10, 0, 0]
        System.out.println(numbers[0]);

        String[] names = new String[3]; // [null, null, null]
    }
}
