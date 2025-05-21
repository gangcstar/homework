package task_7;

public class Rectangle{
        double width;
        double height;

        static int counter = 0;

        public Rectangle() {
            counter++;

        }

        public double area(){
                return width*height;
        }

        public double perimeter() {
                return 2*(width+height);
        }


    }

