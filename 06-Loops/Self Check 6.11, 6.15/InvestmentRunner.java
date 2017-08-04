package Chapter6Review;

//Self Check 6.11 and 6.15
import section_3.*;

/**
 * This program computes how much an investment grows in a given number of
 * years.
 */
public class InvestmentRunner {

    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        final int YEARS = 20;
        final int PERIODS = 5;

        Investment invest = new Investment(INITIAL_BALANCE, RATE);

        for (int i = 1; i <= PERIODS; i++) {
            invest.waitYears(YEARS);
            System.out.printf("The balance after %d years is "
                    + "%.2f%n", invest.getYears(), invest.getBalance());
        }

    }
}
