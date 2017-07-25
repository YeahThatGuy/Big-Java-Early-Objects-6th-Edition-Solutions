package Chapter5Review;

import java.util.Scanner;

public class R55 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x value: ");
        double x = in.nextDouble();
        System.out.print("Enter the y value: ");
        double y = in.nextDouble();

        if (x > 0) {
            y = x;
        } else {
            y = 0;
        }

        System.out.printf("Actual value of x: %2.1f\n", x);
        System.out.printf("Actual value of y: %2.1f\n", y);
    }

}
