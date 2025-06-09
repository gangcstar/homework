package task_16;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static void printIsWeekend(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println(day + " is Weekend!");
        } else  {
            System.out.println(day + " is not Weekend!");
        }
    }
}
