package work_24_04_2025;

import java.util.Stack;

public class Lesson {

    // push
    /*
    push
    pop
    peek
    isEmpty
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack(0);
        stack.push(5);
        stack.push(1);
        stack.push(7);
        stack.print(); // 5 1 7


        //System.out.println("Верхний элемент: " + stack.peek()); // 7
        //System.out.println("Извлекаем: " + stack.pop()); //  7
        stack.print(); //  5 1
    }
    
}
