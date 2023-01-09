import java.util.Scanner;
public class Exercise8 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the dolar cotation of the day: ");
        float dolarCotation = scanner.nextFloat();
        System.out.println("Please inform the amount of dolars to convert: ");
        float dolarAmount = scanner.nextFloat();

        float conversion = dolarCotation * dolarAmount;

        System.out.print("The amount of " + dolarAmount + " dolars is equal to the amount of " + conversion +" in reais");

    }
}
