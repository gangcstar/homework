package task_16;


public class Main {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
                System.out.println(days[i]);
            }
        System.out.println();
        isWeekend(Day.SATURDAY);
        }

    public static void isWeekend(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println(day + " is Weekend!");
        } else {
            System.out.println(day + " is not Weekend!");
        }
    }
}
