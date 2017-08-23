package Chapter6Review;

//Self Check 35
import java.util.Scanner;

public class StringPosition {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        String input = in.nextLine();

        char ch = '?';
        int position = input.length() - 1;
        boolean found = false;

        while (!found && position >= 0) {
            ch = input.charAt(position);
            if (ch == ' ') {
                found = true;
            } else {
                position--;
            }
        }
        System.out.printf("The last space in the string"
                + " is in position number %d.%n", position);
        
    }
}
