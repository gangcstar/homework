package task_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаем и добавляем прямоугольники
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1.1,4.0));
        rectangles.add(new Rectangle(2.1,3.0));
        rectangles.add(new Rectangle(3.1,2.0));

        //создаем и добавляем квадраты
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(2));
        squares.add(new Square(3));


        //вычисляем площадь всех прямоугольников
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).area());
        }

        //вычисляем площадь всех квадратов
        for (int i = 0; i < squares.size(); i++) {
            System.out.println(squares.get(i).area());
        }
    }
}
