import java.util.Scanner;
public class Exercise6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform number A: ");
        int numberA = scanner.nextInt();
        System.out.println("Please inform number B: ");
        int numberB = scanner.nextInt();

        int storedValue = numberA;
        numberA = numberB;
        numberB = storedValue;



        System.out.println("Changing the values, the value of number A is " + numberA + ", and the value of number B is " + numberB);

    }
}
