import java.util.Scanner;
public class Exercise15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform a integer number:");
        int number = scanner.nextInt();

        if (number > 100 && number < 200) {
            System.out.print("This number is between 100 and 200");
        } else {
            System.out.print("Finish");
        }
    }
}
