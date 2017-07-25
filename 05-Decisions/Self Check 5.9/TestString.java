package SelfCheck5;

//SelfCheck 5.9
import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Y to quit: ");
        String input = in.next();

        if (input.equals("Y")) {
            System.out.println("Goodbye");
        }
    }

}
