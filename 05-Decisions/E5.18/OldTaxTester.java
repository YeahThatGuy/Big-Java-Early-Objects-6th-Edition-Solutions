package Chapter5Review;

//E5.18
import java.util.Scanner;

public class OldTaxTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = in.nextInt();

        OldTax calculator = new OldTax(income);

        System.out.println("You need to pay $" + calculator.getTax() + " on"
                + " $" + income);

    }

}
