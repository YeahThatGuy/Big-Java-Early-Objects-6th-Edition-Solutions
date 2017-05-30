package e13;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Define the upper limit: ");
        int upLimit = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= upLimit; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the first " + upLimit + " numbers is " + sum);
        
    }
    
}