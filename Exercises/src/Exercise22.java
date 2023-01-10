import java.util.Scanner;
public class Exercise22 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while(counter < 3) {

            System.out.println("Please inform the cost of the product: ");
            float cost = scanner.nextFloat();
            System.out.println("Please inform the price of sale of the product: ");
            float salePrice = scanner.nextFloat();

            float profit = salePrice - cost;

            if (profit == 0) {
                System.out.println("The cost of the product is R$" + cost + " and his sale price is R$" + salePrice + ". There is no profit in that product");
            } else if (profit > 0) {
                System.out.println("The cost of the product is R$" + cost + " and his sale price is R$" + salePrice + ". The profit in that product is R$" + profit);
            } else {
                System.out.println("The cost of the product is " + cost + " and his sale price is " + salePrice + ". The loss in that product is R$" + profit);
            }

            counter++;
        }
    }
}
