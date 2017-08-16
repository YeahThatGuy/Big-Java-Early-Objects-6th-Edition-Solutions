package Chapter6Review;

//E6.20, E6.21
import java.util.Scanner;

public class CurrencyTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Boolean checker = true;

        while (checker) {
            System.out.print("Enter the exchange rate for USD/JPY, 0 to quit: ");
            double exchangeRate = in.nextDouble();
            if (exchangeRate == 0) {
                checker = false; //can be removed for only E6.20
                break;
            }

            System.out.print("Enter the USD amount to convert to JPY, 0 to quit: ");
            double target = in.nextDouble();

            if (target != 0) {
                CurrencyConverter transaction = new CurrencyConverter(exchangeRate, target);
                transaction.convertCurrency();
                System.out.printf("USD %2.2f in JPY equals %2.2f .%n", target, transaction.getCurrency());
            } else {
                checker = false;
            }
        }
        
        //the loop from below applies to E6.21 only
        while (!checker) {
            System.out.print("Enter the exchange rate for JPY/USD, 0 to quit: ");
            double exchangeRate = in.nextDouble();
            if (exchangeRate == 0) {
                break;
            }

            System.out.print("Enter the JPY amount to convert to USD, 0 to quit: ");
            double target = in.nextDouble();

            if (target != 0) {
                CurrencyConverter transaction = new CurrencyConverter(exchangeRate, target);
                transaction.convertCurrency();
                System.out.printf("JPY %2.2f in USD equals %2.2f .%n", target, transaction.getCurrency());
            } else {
                checker = true;
            }
        }
    }
}
