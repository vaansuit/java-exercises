import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform the first number: ");
        int firstN = scanner.nextInt();
        System.out.println("Inform the second number: ");
        int secondN = scanner.nextInt();

        int sum = firstN + secondN;
        int sub = firstN - secondN;
        double div = firstN / secondN;

        double mul = firstN * secondN;

        System.out.println("The sum of the numbers is :" + sum);
        System.out.println("The subtraction of the numbers is :" + sub);
        System.out.println("The division of the numbers is :" + div);
        System.out.println("The multiplication of the numbers is :" + mul);
    }


}
