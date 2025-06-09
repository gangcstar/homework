package task_4;

public class Main {
    public static void main(String[] args) {

    }
    public static String grade(int score){
        return switch (score) {
            case 0 -> "F";
            case 1 -> "E";
            case 2 -> "D";
            case 3 -> "C";
            case 4 -> "B";
            case 5 -> "A";
            default -> "Неизвестный score";
        };
    }
}
