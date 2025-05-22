package task_26;

import task_25.Movable;

public class Rectangle extends Figure  {
    private double width;
    private double height;

    private static int counter = 0;

    public Rectangle() {
        counter++;
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area()
    {
        return width*height;
    }

    public double perimeter()
    {
        return 2*(width+height);
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }


    @Override
    public String toString() {
        return "Rectangle(" + width + "*" + height + ")";
    }
}

