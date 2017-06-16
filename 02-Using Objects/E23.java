package PracticeAnswers;

public class E23 {
    public static void main(String[] args) {
        
        String word = "Mississippi";
        String result = word.replace("i", "ii");
        System.out.println("The length of the string " + 
                result + " is: " + result.length());
        
        result = result.replace("ss", "s");
        System.out.println("The length of the string " +
                result + " is: " + result.length());
    }
}
