package Chapter6Review;

//E6.9
import java.util.Scanner;

public class ExtractCharsTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        ExtractChars characters = new ExtractChars(word);
        characters.getChars();

    }

}
