import java.util.Scanner;

public class Exercise28 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 584) {

            System.out.println("Please inform the name of the employee: ");
            String name = scanner.next();
            System.out.println("Please inform the current salary R$: ");
            float salary = scanner.nextFloat();

            if (salary <= 3900) {
                float percentage = 0.5f;
                float raise = salary * percentage;
                float newSalary = raise + salary;
                System.out.println("The reajusted salary for the employee named " + name + " is R$ " + newSalary + " and the value of the raise is R$ " + raise);
            } else if (salary >= 3900 && salary <= 13000) {
                float percentage = 0.2f;
                float raise = salary * percentage;
                float newSalary = raise + salary;
                System.out.println("The reajusted salary for the employee named " + name + " is R$ " + newSalary + " and the value of the raise is R$ " + raise);
            } else if (salary >= 13000 && salary <= 26000) {
                float percentage = 0.15f;
                float raise = salary * percentage;
                float newSalary = raise + salary;
                System.out.println("The reajusted salary for the employee named " + name + " is R$ " + newSalary + " and the value of the raise is R$ " + raise);
            } else {
                float percentage = 0.1f;
                float raise = salary * percentage;
                float newSalary = raise + salary;
                System.out.println("The reajusted salary for the employee named " + name + " is R$ " + newSalary + " and the value of the raise is R$ " + raise);
            }

            counter++;
        }
    }
}
