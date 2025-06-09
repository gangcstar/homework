package task_3;

public class Main {
    public static void main(String[] args) {
        double tempMin = 0;
        double tempMax = 100;

        System.out.println(tempMin + " °C = " + Conversion.convertKelvin(tempMin) + " K");  // конвертация в градусы Кельвина
        System.out.println(tempMax + " °C = " + Conversion.convertFahrenheit(tempMax) + " K");

        System.out.println();

        System.out.println(tempMin + " °C = " + Conversion.convertFahrenheit(tempMin) + " °F"); // конвертация в градусы Фаренгейта
        System.out.println(tempMax + " °C = " + Conversion.convertFahrenheit(tempMax) + " °F");
    }
}
