package SelfCheck5;

//SelfCheck 5.10
public class TestEmptyString {

    public static void main(String[] args) {

        String str = "";

        //method 1 for testing the equality of an empty string
        if (str.equals("")) {
            System.out.printf("String \"%s\" is empty. \n", str);
        }

        //method 2 for testing the equality of an empty string
        int result = str.compareTo("");

        if (result == 0) {
            System.out.printf("String \"%s\" is empty. \n", str);
        }

    }
}
