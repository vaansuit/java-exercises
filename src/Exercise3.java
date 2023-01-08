import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform the amount of gasoline in liters: ");
        float gasoline = scanner.nextFloat();
        System.out.println("Please inform the distance in KM that you will go through");
        float distance = scanner.nextFloat();

        float result = distance / gasoline;
        System.out.println("The media of km per litre is: " + result);
    }

}
