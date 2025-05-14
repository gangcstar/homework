package task_8;

public class Rectangle{
    int width;
    int height;

    private static int counter = 0;

    public Rectangle() {
        counter++;
        width = 1;
        height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area(){
        return width*height;
    }

    public int perimeter() {
        return 2*(width+height);
    }


}

