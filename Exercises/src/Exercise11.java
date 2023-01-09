import java.util.Scanner;
public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the name of the product:");
        String productName = scanner.nextLine();
        System.out.println("Please inform the cost of the product:");
        float originalCost = scanner.nextFloat();
        System.out.println("Please informe the percentage to sell of the product:");
        float percentage = scanner.nextFloat();

        float math = (percentage * originalCost) / 100;
        float priceToSale = math + originalCost;

        System.out.print("The product " + productName + " price for sale is R$ " + priceToSale);
    }
}


