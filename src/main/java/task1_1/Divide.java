package task1_1;

public class Divide {
    public static void main(String[] args) {
        System.out.println(divide());
    }
    public static int divide() {
        try {
            int result = safeDivizion(11, 0);
            return result;
        } catch (
                ArithmeticException exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
         
    }

    public static int safeDivizion ( int a, int b) throws ArithmeticException {
            if (b == 0) throw new ArithmeticException("Деление на ноль!");
            return a / b;
    }
}

