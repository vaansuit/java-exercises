import java.util.Scanner;
public class Exercise16 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Inform the first grade: ");
        double firstGrade = scanner.nextDouble();
        System.out.println("Inform the second grade: ");
        double secondGrade = scanner.nextDouble();
        System.out.println("Inform the third grade: ");
        double thirdGrade = scanner.nextDouble();

        double finalGrade = (firstGrade + secondGrade + thirdGrade) / 3;

        if (finalGrade >= 7) {
            System.out.println("Student " + studentName + " is approved. ");
        } else if (finalGrade >= 5.1 && finalGrade <= 6.9) {
            System.out.println("Student " + studentName + " is in summer school. ");
        } else {
            System.out.println("Student " + studentName + " is reproved. ");
        }
    }
}
