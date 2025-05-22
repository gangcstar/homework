package task_20;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Value" + value;
    }
}
