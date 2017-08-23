package Chapter6Review;

//E6.11
import java.util.Scanner;

public class VowelsTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = in.next();

        Vowels initialWord = new Vowels(word);

        initialWord.countVowels();

        System.out.printf("The number of vowels in the word \"%s\" is: "
                + "%d %n", word, initialWord.getVowelCount());

    }
}
