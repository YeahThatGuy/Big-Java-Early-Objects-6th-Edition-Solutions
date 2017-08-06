package Chapter6Review;

//Self Check 20
import java.util.Scanner;

public class DoCheckerDouble {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value = 0;
        int sum = 0;
        int valueTwo = 0;
        do {
            valueTwo = value;
            System.out.print("Enter a non repeating integer that is != 0: ");
            value = in.nextInt();
            sum = sum + value;
        } while ((value != 0) && (value != valueTwo));

        System.out.println(sum);
    }
}
