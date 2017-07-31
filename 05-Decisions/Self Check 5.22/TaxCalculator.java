package section_4;

import java.util.Scanner;

/**
 * This program calculates a simple tax return.
 */
public class TaxCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Are you married? (Y/N) ");
        String input = in.next();
        int status = 0;

        while (!input.isEmpty()) {
            if (input.equals("Y")) {
                status = TaxReturn.MARRIED;
                break;
            } else if (input.equals("N")) {
                status = TaxReturn.SINGLE;
                break;
            } else {
                System.out.print("Are you married? (Y/N) ");
                input = in.next();
            }
            continue;
        }

        TaxReturn aTaxReturn = new TaxReturn(income, status);

        System.out.println(
                "Tax: "
                + aTaxReturn.getTax());
    }
}
