package task_25;

public class Square extends Rectangle {
    private double width;
    private double heigth;
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            this.heigth = width;
        }
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + ")";
    }
}
