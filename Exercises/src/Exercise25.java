import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please inform the second number:");
        double secondNumber = scanner.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equals");
        } else if (firstNumber > secondNumber) {
            System.out.println("The numbers are differents and the bigger one is " + firstNumber);
        } else {
            System.out.println("The numbers are differents and the bigger one is " + secondNumber);
        }
    }
}
