import java.util.Scanner;
public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform a number: ");
        int number = scanner.nextInt();

        if (number > 80 || number < 25 || number == 40) {
            System.out.println("The number " + number + " fulfills the requirements.");
        }

    }
}
