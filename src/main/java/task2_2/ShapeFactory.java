package task2_2;

public class ShapeFactory {
    public static Figure ofSquare(double side) {
        return new Square(side);
    }

    public static Figure ofRectangle(double width, double height) {
        return new Rectangle(width, height);
    }
}
