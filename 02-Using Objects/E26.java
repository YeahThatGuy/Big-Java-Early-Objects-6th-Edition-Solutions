package PracticeAnswers;

import java.util.Scanner;

public class E26 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        String encodedWord = word.replace("i", "!");
        //encodedWord = word.replace("s", "$");
        System.out.println(encodedWord);
    }
}
