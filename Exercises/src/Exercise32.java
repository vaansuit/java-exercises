import java.util.Scanner;
public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the first value (must be an integer): ");
        int a = scanner.nextInt();
        System.out.println("Please inform the second value (must be an integer): ");
        int b = scanner.nextInt();
        System.out.println("Please inform the third value (must be an integer): ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("This is an equilater triangle, that is also an isoscele.");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is an isoscele triangle.");
            } else {
                System.out.println("This is an scalene triangle");
            }
        } else {
            System.out.println("That's not a triangle.");


        }
    }
}
