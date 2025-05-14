package task_5;

public class Main {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));
        System.out.println(getSum(6));
    }

    public static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long getSum(int n) {
return 0;
    }
}
