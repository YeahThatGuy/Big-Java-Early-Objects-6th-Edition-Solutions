package Chapter6Review;

//E6.9
public class ExtractChars {

    private String word = "";

    public ExtractChars(String aWord) {
        word = aWord;
    }

    public void getChars() {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }
    }
}
