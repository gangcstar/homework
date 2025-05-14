package work_24_04_2025;

public class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        this.capacity = size;
        arr = new int[size];

        top = -1;
    }

    public void push(int val){
        if (top == capacity-1){
            System.out.println("Стек заполнен");
            return;
        }
        top += 1;
        arr[top] = val;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Стек пуст");
            return -1;
        }
        int result =  arr[top];
        top--;
        return result;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Стек пуст");
            return -1;
        }
        return arr[top];
    }


    private boolean isEmpty() {
        return top == -1;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Стек пуст");
        }else{
            System.out.println("Стек: ");
            for (int i = 0; i<=top; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}
