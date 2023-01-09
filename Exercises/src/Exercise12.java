import java.util.Scanner;
public class Exercise12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the factory price of the car:");
        float factoryPrice = scanner.nextFloat();

        float factoryPriceWithTaxes = (45 * factoryPrice) / 100;
        float priceWithTaxes = factoryPrice + factoryPriceWithTaxes;
        float priceDistributor = (25 * priceWithTaxes) / 100;
        float consumerPrice = priceDistributor + factoryPrice;

        System.out.print("The price to the final customer is R$" + consumerPrice);

    }
}
