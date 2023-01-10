import java.util.Scanner;
public class Exercise30 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform the first number:");
        int firstN = scanner.nextInt();
        System.out.println("Inform the second number:");
        int secondN = scanner.nextInt();
        System.out.println("Inform the third number:");
        int thirdN = scanner.nextInt();

        if (firstN > secondN) {
            int temp = firstN;
            firstN = secondN;
            secondN = temp;
        }
        if (secondN > thirdN) {
            int temp = secondN;
            secondN = thirdN;
            thirdN = temp;
        }
        if (firstN > secondN) {
            int temp = firstN;
            firstN = secondN;
            secondN = temp;
        }

        System.out.println("Ordered by asc: " + firstN + " " + secondN + " " + thirdN);
    }
}
