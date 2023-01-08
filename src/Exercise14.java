import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the first number:");
        int firstN = scanner.nextInt();
        System.out.println("Please inform the second number:");
        int secondN = scanner.nextInt();

        if(firstN > secondN) {
            System.out.println(firstN + " is grather than " + secondN);
        } else {
            System.out.println(secondN + " is grather than " + firstN);
        }
    }
}
