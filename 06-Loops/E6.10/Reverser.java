package Chapter6Review;

//E6.10
public class Reverser {

    private String initialWord;
    private String reversed;

    public Reverser(String aReversed) {
        initialWord = aReversed;
        reversed = "";
    }

    public void reverse() {
        for (int i = initialWord.length() - 1; i >= 0; i--) {
            reversed = reversed + initialWord.charAt(i);
        }
    }

    public String getReverse() {
        return reversed;
    }
}
