package task_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаем и добавляем прямоугольники и квадраты
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1.1,4.0));
        rectangles.add(new Rectangle(2.1,3.0));
        rectangles.add(new Rectangle(3.1,2.0));

        rectangles.add(new Square(2.0));
        rectangles.add(new Square(3.0));


        //вычисляем площадь всех прямоугольников
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).area());
        }
    }
}
