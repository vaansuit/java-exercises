import java.util.Scanner;
public class Exercise18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while(counter < 75) {
            System.out.println("Please inform the age of the person:");
            int age = scanner.nextInt();

            if(age >= 18 ) {
                System.out.println("This person is over 18 years old.");
            } else {
                System.out.println("This person is under 18 years old.");
            }

            counter++;
        }

    }
}
