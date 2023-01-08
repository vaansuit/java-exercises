import java.util.Scanner;
public class Exercise7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9*celsius + 160) /5;

        System.out.print("The value " + celsius + " in celsius is equivalent to the value " + fahrenheit + " in fahrenheit.");

    }
}
