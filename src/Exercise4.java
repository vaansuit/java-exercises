import java.util.Scanner;
public class Exercise4 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the saler name: ");
        String salerName = scanner.nextLine();
        System.out.println("Please inform the fixed salary (in R$): ");
        float fixedSalary = scanner.nextFloat();
        System.out.println("Please inform the amount of sales in the month made by"+ salerName +" (in R$): ");
        float salesMade = scanner.nextFloat();

        double comission = (15 * salesMade) / 100;
        double fullSalary = comission + fixedSalary;

        System.out.print("The saler name is: " + salerName +". His base salary is R$ " + fixedSalary +
                " and his salary plus comissions in the end of this month is R$ " + fullSalary);
    }

}
