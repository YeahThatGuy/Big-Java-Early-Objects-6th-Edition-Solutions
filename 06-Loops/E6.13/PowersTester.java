package Chapter6Review;

//E6.13
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowersTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your base: ");
        int target = in.nextInt();
        System.out.print("Enter your exponent: ");
        int power = in.nextInt();
        
        List<Integer> result = new ArrayList<Integer>();
        Powers tester = new Powers(target, power);
        result = tester.calculatePower();
        //prints the values as a list
        System.out.println(result);
        
        //prints the list values on separate lines
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        
        //Alternative solution by using loops in the main, not ideal since
        //accidental changes to the code in the main will affect the result
        /*
        for (int i = 0; i <= power; i++) {
            tester.calculatePower(i);
            System.out.println(tester.getPower());
        }
        */
        
        
    }
}
