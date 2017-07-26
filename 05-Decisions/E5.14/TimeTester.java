package Chapter5Review;

import java.util.Scanner;

public class TimeTester {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st time in \"0000\" military format: ");
        int time1 = in.nextInt();
        System.out.print("Enter the 2nd time in \"0000\" military format: ");
        int time2 = in.nextInt();
        
        Time timeOne = new Time(time1);
        Time timeTwo = new Time(time2);
        int results = timeOne.compareTo(timeTwo);
        
        System.out.println(results);
    }
}
