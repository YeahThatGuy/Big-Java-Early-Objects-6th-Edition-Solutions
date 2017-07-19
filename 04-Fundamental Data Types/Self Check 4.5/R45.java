package r45;

import java.util.Scanner;
public class R45 {

    public static void main(String[] args) {
                       
        Scanner in = new Scanner(System.in);
        
        //Relative velocity
        /*System.out.print("Assign a value to initial altitude: ");
        double s_0 = in.nextDouble();
        System.out.print("Assign a value to initial vertical speed: ");
        double v_0 = in.nextDouble();
        System.out.print("Assign a value to acceleration of gravity: ");
        double g = in.nextDouble();
        System.out.print("Assign a value to the time at which the action happens: ");
        double t = in.nextDouble();
        
        double s = s_0 + (v_0 * t) + (1.0/2 * g * t * t);
        System.out.print("The altitude of the fish at time " + t + " equals: " + s);
        
        */
        
        //Future value
        
        System.out.print("Assign a value to the present value: ");
        double pv = in.nextDouble();
        System.out.print("Assign value to the interest: ");
        double interest = in.nextDouble();
        System.out.print("Assign a value to years: ");
        double years = in.nextDouble();
        
        double fv = pv * Math.pow(1+(interest/100.0), years);
        System.out.printf("The future value of " + pv + " after " + years + ""
                + " years, at " + interest + " interest equals: %8.2f", fv);
    }
    
}