package Chapter6Review;

//Self Check 19
import java.util.Scanner;

public class DoChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value;
        int sum = 0;
        do {
            System.out.print("Enter an integer that is != 0: ");
            value = in.nextInt();
            sum = sum + value;
        } while (value != 0);
        
        System.out.println(sum);
    }
}
