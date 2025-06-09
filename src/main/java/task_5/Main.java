package task_5;

public class Main {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));
        System.out.println(getSum(999));
    }

    public static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long getSum(int n) {
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
return sum;
    }
}
