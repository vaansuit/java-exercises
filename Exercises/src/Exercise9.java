import java.util.Scanner;
public class Exercise9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the amount of money deposited: ");
        float moneyDeposited = scanner.nextFloat();
        System.out.println("Please inform how many months has passed: ");
        int months = scanner.nextInt();

        float fees = months * 0.07f;
        float yield = ( fees / 100) * moneyDeposited ;
        double totalMoney = yield + moneyDeposited ;

        System.out.print("The amount of money after " + months + " months is going to be R$ " + totalMoney);


    }
}
