import java.util.Scanner;
public class Exercise24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while(counter < 3) {
            System.out.println("Please inform a number: ");
            double number = scanner.nextDouble();

            if (number > 0){
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is " + number);
            }

            counter++;
        }
    }
}
