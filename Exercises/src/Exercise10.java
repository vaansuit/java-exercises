import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the total value of the cart: ");
        float totalValue = scanner.nextFloat();

        float toPayInInstallments = totalValue / 5;

        System.out.print("The amount of value to pay in installemnts is R$" + toPayInInstallments);
    }
}
