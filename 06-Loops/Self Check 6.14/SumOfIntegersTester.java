package Chapter6Review;

//Self Check 6.14

import java.util.Scanner;

public class SumOfIntegersTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper boundary: ");
        int n = in.nextInt();
        
        SumOfIntegers tester = new SumOfIntegers(n);
        tester.calculateSum();

        System.out.println(tester.getSum());
    }
}
