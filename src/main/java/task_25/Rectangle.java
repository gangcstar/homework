package task_25;

public class Rectangle implements Movable {
    protected double width;
    protected double height;
    protected double x;
    protected double y;

    private static int counter = 0;

    public Rectangle() {
        counter++;
        width = 1;
        height = 1;
        x = 1;
        y = 1;
    }

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        counter++;
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + "*" + height + ")";
    }
}

