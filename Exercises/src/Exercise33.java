import java.util.Scanner;
public class Exercise33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the seniority level of the professor (1 for JR, 2 for Middle or 3 for Senior)");
        int seniority = scanner.nextInt();
        System.out.println("Please inform how many hours the teacher has worked this week: ");
        int hour = scanner.nextInt();

        switch(seniority) {
            case 1:
                float salaryJr = hour * 12;
                System.out.println("The salary is R$ " + salaryJr);
                break;
            case 2:
                float salaryMid = hour * 17;
                System.out.println("The salary is R$ " + salaryMid);
                break;
            case 3:
                float salarySen = hour * 25;
                System.out.println("The salary is R$ " + salarySen);
                break;
            default:
                System.out.println("Invalid seniority, system closed.");
                break;
        }
    }
}
