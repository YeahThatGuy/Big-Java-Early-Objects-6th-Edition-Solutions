package Chapter6Review;

//E6.11
public class Vowels {

    private String initialWord;
    private final String VOWEL_LIST = "aeiouy";
    private int counter;

    public Vowels(String aInitialWord) {
        initialWord = aInitialWord;
    }

    public void countVowels() {
        char wordChar = ' ';
        char vowelChar = ' ';

        for (int i = 0; i < initialWord.length(); i++) {
            wordChar = initialWord.charAt(i);
            for (int j = 0; j < VOWEL_LIST.length(); j++) {
                vowelChar = VOWEL_LIST.charAt(j);
                if (wordChar == vowelChar) {
                    counter++;
                }
            }
        }
    }

    public int getVowelCount() {
        return counter;
    }
}
