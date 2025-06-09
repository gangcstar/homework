package task_16;


public class Main {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
                System.out.println(days[i]);
            }
        System.out.println();
        Day.printIsWeekend(Day.SATURDAY);
        }
}
