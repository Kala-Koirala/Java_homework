import java.util.Scanner;

public class TemperatureConverter {
    static final double factor = 9.0 / 5.0;
    static final double num = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenhite: " + ((celsius * factor) + num));
    }
}
