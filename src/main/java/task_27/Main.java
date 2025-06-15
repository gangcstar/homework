package task_27;

public class Main {
    public static void main(String[] args) {
        try {
            int result = Division.divide(5,0);
            System.out.println(result);
        }
        catch (DivizionByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
