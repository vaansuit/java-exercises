import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform a integer number: ");
        int number = scanner.nextInt();

        if(number > 10) {
            System.out.print("This number is higher than 10");
        } else {
            System.out.print("This numer is lower than 10");
        }
    }
}
