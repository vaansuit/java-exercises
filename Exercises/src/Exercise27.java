import java.util.Scanner;
public class Exercise27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while(running) {

            System.out.println("Please inform the value of the car: ");
            float vehiclePrice = scanner.nextFloat();

            if (vehiclePrice == 0) {
                System.out.println("PROGRAM CLOSED");
                break;
            } else {
                System.out.println("Please inform the type of fuel: 1 for gasoline, 2 for alcohol or 3 for diesel");
                int fuelType = scanner.nextInt();

                if (fuelType == 1) {
                    float discountPercentage = 0.21f;
                    float totalDiscount = vehiclePrice * discountPercentage;
                    float saleValue = vehiclePrice - totalDiscount;
                    System.out.println("The final price for the vehicle is R$ " + saleValue);
                } else if (fuelType == 2) {
                    float discountPercentage = 0.25f;
                    float totalDiscount = vehiclePrice * discountPercentage;
                    float saleValue = vehiclePrice - totalDiscount;
                    System.out.println("The final price for the vehicle is R$ " + saleValue);

                } else if (fuelType == 3) {
                    float discountPercentage = 0.14f;
                    float totalDiscount = vehiclePrice * discountPercentage;
                    float saleValue = vehiclePrice - totalDiscount;
                    System.out.println("The final price for the vehicle is R$ " + saleValue);

                }
            }
        }

    }
}
