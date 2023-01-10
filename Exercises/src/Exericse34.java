import java.util.Scanner;
public class Exericse34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the age of the athlete");
        int age = scanner.nextInt();

        if (age >= 5 && age <= 7) {
            System.out.println("Infant A.");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Infant B.");
        } else if (age >= 11 && age <= 13) {
            System.out.println("Juvenile A.");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Juvenile B.");
        } else if (age >= 18 && age <= 25) {
            System.out.println("Senior.");
        } else {
            System.out.println("Age out of the allowed range.");
        }
    }
}
