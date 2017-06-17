package Ch2Exercises;

public class E27 {

    public static void main(String[] args) {

        String word = "Hello, World!";
        int i = 0;
        
        while (i < 1) {
            word = word.replace("e", "u");
            word = word.replace("o", "e");
            word = word.replace("u", "o");
            i++;
        }

        System.out.println(word);
    }
}