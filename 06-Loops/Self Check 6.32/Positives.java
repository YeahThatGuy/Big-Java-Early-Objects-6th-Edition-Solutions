package Chapter6Review;

//Self Check 32
import java.util.Scanner;

public class Positives {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double positiveInput = 0;
        double sum = 0;
        int count = 0;

        while (positiveInput >= 0) {

            System.out.print("Enter a positive number or 0, negative to quit: ");
            positiveInput = in.nextDouble();

            if (positiveInput >= 0) {
                sum = sum + positiveInput;
                count++;
            }
        }

        System.out.printf("The sum of %d inputs is %.2f .%n", count, sum);
    }
}
