package task_15;

public class Square extends Rectangle {
    private double width;
    private double heigth;
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public String toString() {
        return "Square(" + width + ")";
    }
}
