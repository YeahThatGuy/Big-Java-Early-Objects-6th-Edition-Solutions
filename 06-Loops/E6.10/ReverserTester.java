package Chapter6Review;

//E6.10
import java.util.Scanner;

public class ReverserTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Type a word to reverse it: ");
        String reversed = in.next();

        Reverser word = new Reverser(reversed);
        word.reverse();

        System.out.printf("The reverse of %s is: %s %n", reversed, word.getReverse());

    }
}
