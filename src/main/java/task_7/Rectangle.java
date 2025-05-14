package task_7;

public class Rectangle{
        int width;
        int height;

        static int counter = 0;

        public Rectangle() {
            counter++;

        }

        public int area(){
                return width*height;
        }

        public int perimeter() {
                return 2*(width+height);
        }


    }

