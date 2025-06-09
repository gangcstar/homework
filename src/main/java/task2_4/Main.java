package task2_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList<>();


        //Измеряем время для ArrayList
        long timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long timeFin = System.nanoTime();

        System.out.println(timeFin - timeStart);


        //Измеряем время для LinkedList
        timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        timeFin = System.nanoTime();

        System.out.println(timeFin - timeStart);

    }

}
