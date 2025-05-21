package task_12;

import task_11.Rectangle;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
