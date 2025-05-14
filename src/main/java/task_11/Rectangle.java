package task_11;

public class Rectangle{
    private int width;
    private int height;

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

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }
}

