import java.util.Scanner;
public class Exercise35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform how many hours the lights was on in the last week: ");
        int hours = scanner.nextInt();
        System.out.println("Inform if it is an residence(1), commerce(2) or industry(3)");
        int type = scanner.nextInt();



        switch (type) {
            case 1:
                float toPayR = hours * 0.60f;
                System.out.println("You have to pay R$ " + toPayR);
                break;
            case 2:
                float toPayC = hours * 0.48f;
                System.out.println("You have to pay R$ " + toPayC);
                break;
            case 3:
                float toPayI = hours * 1.29f;
                System.out.println("You have to pay R$ " + toPayI);
                break;
            default:
                System.out.println("Invalid type of residence. Program closed.");
        }

    }
}
