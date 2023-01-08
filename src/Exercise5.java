import java.util.Scanner;
public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Inform the first grade: ");
        double firstGrade = scanner.nextInt();
        System.out.println("Inform the second grade: ");
        double secondGrade = scanner.nextInt();
        System.out.println("Inform the third grade: ");
        double thirdGrade = scanner.nextInt();

        double media = (firstGrade + secondGrade + thirdGrade) / 3;

        System.out.println("The student name is " + studentName + " and his media is " + media);
    }
}
