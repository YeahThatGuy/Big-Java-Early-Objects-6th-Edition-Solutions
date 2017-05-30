package e13;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Define the upper limit: ");
        int upLimit = sc.nextInt();

        int product = 1;
        for (int i = 1; i <= upLimit; i++) {
            product *= i;
        }

        System.out.println("The product of the first " + upLimit + " numbers is " + product);

    }

}
