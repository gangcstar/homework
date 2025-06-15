package task_27;

public class Division  {
    public static int divide(int a, int b) throws DivizionByZeroException {
        if (b==0) throw new DivizionByZeroException("Деление на ноль!");

        return a/b;
    }

}
