package Chapter6Review;

import java.util.Scanner;

public class BankTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter the interest rate: ");
        double interest = in.nextDouble();
        
        Bank investment = new Bank(principal, interest);
        investment.calculateFV(2 * principal);
                
        /*interest = interest / 100.0;

        double futureValue = principal;
        int year;

        for (year = 0; futureValue < (principal * 2); year++) {
            futureValue = (futureValue * interest) + futureValue;
        }
        */
        System.out.printf("The FV, %.2f, will double the original investment in"
                + " %d years. %n", investment.getFV(), investment.getYears());
    }
}