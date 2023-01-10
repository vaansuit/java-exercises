import java.util.Scanner;
public class Exercise26 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            System.out.println("Please inform a integer number:");
            int number = scanner.nextInt();

            switch(number) {
                case 1:
                    System.out.println("Number one");
                    break;
                case 2:
                    System.out.println("Number two");
                    break;
                case 3:
                    System.out.println("Number three");
                    break;
                case 4:
                    System.out.println("Number four");
                    break;
                case 5:
                    System.out.println("Number five");
                    break;
                default:
                    System.out.println("The number is invalid");
                    break;

            }
            counter++;
        }
    }
}
