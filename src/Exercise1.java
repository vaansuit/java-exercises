import java.util.Scanner;

public class Exercise1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);



            System.out.println("Inform the first number: ");
            int firstN = scanner.nextInt();
            System.out.println("Inform the second number: ");
            int secondN = scanner.nextInt();

            int sum = firstN + secondN;

            System.out.println("The sum of the inputs is: " + sum);


        }

}
