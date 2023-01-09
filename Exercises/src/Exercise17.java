import java.util.Scanner;
public class Exercise17 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterInputs = 0;
        int matchCounter = 0;

        while(counterInputs < 80) {
            System.out.println("Inform a integer number");
            int number = scanner.nextInt();
            if (number >= 10 && number <= 150) {
                matchCounter++;
            }
            counterInputs++;
        }

        System.out.println("The amount of matches is " + matchCounter);
    }
}
