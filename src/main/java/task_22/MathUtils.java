package task_22;

public class MathUtils {
    static int gcd(int a, int b) {
        int gcd;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        return a;
    }
}
