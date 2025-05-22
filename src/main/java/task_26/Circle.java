package task_26;

import task_22.MathUtils;

import java.math.MathContext;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }
}
