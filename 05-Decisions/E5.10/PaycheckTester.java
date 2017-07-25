package Chapter5Review;

//E5.10

import java.util.Scanner;

public class PaycheckTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your hourly wage: ");
        double salaryPerHour = in.nextDouble();
        System.out.print("Enter your worked hours: ");
        double hours = in.nextDouble();
        
        //pass the values from the Scanner to the constructor
        Paycheck worker = new Paycheck(name, salaryPerHour, hours);
        worker.deducePaycheck();
        System.out.println("Expected weekly salary is: £570");
        System.out.println("Actual weekly salary is: £" + worker.getPaycheck());
    }
}
