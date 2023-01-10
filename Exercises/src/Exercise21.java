import java.util.Scanner;
public class Exercise21 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 2) {
            System.out.println("Please inform the name of the candidate: ");
            String name = scanner.next();
            System.out.println("Please inform the gender of the candidate, 1 for male 2 for female: ");
            int gender = scanner.nextInt();
            System.out.println("Please inform the age of the candidate: ");
            int age = scanner.nextInt();
            System.out.println("Please inform if the candidate is able to perform, 1 for yes 2 for no: ");
            int able = scanner.nextInt();

            if(gender == 1 && able == 1) {
                System.out.println("The candidate " + name + " is male with " + age + " years old and able to perform in the army.");
            } else if (gender == 1 && able == 2) {
                System.out.println("The candidate " + name + " is male with " + age + " years old and not able to perform in the army.");
            } else if (gender == 2 && able == 1) {
                System.out.println("The candidate " + name + " is female" + age + " years old and able to perform in the army.");
            } else if (gender == 2 && able == 2) {
                System.out.println("The candidate " + name + " is female " + age + " years old and not able to perform in the army.");
            }

            counter++;
        }


    }
}
