package task_8;

public class Rectangle{
    double width;
    double height;

    private static int counter = 0;

    public Rectangle() {
        counter++;
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        counter++;
    }

    public double area(){
        return width*height;
    }

    public double perimeter() {
        return 2*(width+height);
    }


}

