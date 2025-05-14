package task_4;

public class Main {
    public static void main(String[] args) {

    }
    public static String grade(int score){
        return switch (score) {
            case 0 -> "A";
            case 1 -> "B";
            case 2 -> "C";
            case 3 -> "D";
            case 4 -> "E";
            case 5 -> "F";
            default -> "Неизвестный score";
        };
    }
}
