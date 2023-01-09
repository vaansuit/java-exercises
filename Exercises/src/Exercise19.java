import java.util.Scanner;
public class Exercise19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 56 ) {
            System.out.println("Please inform your name: ");
            String name = scanner.next();
            System.out.println("Please digit 1 if you are male or 2 for female: ");
            int sex = scanner.nextInt();

            if (sex == 1) {
                System.out.println("Hi " + name + ", you are a male.");
            } else if (sex == 2) {
                System.out.println("Hi " + name + ", you are a female.");
            } else {
                System.out.println("Please search help, there is only 2 genders.");
            }

            counter++;
        }
    }
}
