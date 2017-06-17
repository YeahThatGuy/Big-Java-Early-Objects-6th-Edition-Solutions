package Ch2Exercises;

import java.util.Scanner;

public class E26 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        String encodedWord = word;
        
        while (encodedWord.contains("i") && encodedWord.contains("s")) {
            encodedWord = encodedWord.replace("i", "!");
            encodedWord = encodedWord.replace("s", "$");
        }
        System.out.println("The encoded version of " + word + " is: " + encodedWord);
    }
}