package task_10;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getWidth()+ " " + rectangle.getHeight());

        Rectangle rectangle2 = new Rectangle(5,2);
        System.out.println(rectangle2.getWidth()+ " " + rectangle2.getHeight());

        rectangle2.setHeight(10);
        rectangle2.setWidth(4);
        System.out.println(rectangle2.getWidth()+ " " + rectangle2.getHeight());
        System.out.println(rectangle2.perimeter());
    }
}
