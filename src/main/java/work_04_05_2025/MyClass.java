package work_04_05_2025;

public class MyClass {
    public int number;
    public static int staticNumber;

    public void printHello(){
        System.out.println("Hello");
    }


    public void test(String testString){
        int localeNumber = 10;

        localeNumber = 4;
        testString = "test";

        this.printHello();
        this.number = 5;

        printHello();
        number = 5;
    }

}
