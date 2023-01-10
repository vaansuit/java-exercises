import java.util.Scanner;
public class Exercise31 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the value of A(must be an integer): ");
        int a = scanner.nextInt();
        System.out.println("Please inform the value of B(must be an integer): ");
        int b = scanner.nextInt();
        System.out.println("Please inform the value of C(must be an arithmetic operator): ");
        char c = scanner.next().charAt(0);

        switch(c){
            case '+':
                int sum = a + b;
                System.out.println("The sum is " + sum);
                break;
            case '-':
                int sub = a - b;
                System.out.println("The subtraction is " + sub);
                break;
            case '*':
                int mul = a * b;
                System.out.println("The multiplication is " + mul);
                break;
            case '/':
                double div = a / b;
                System.out.println("The division is " + div);
                break;
            default:
                System.out.println("Invalid arithmetic operator.");
                break;


        }

    }
}
