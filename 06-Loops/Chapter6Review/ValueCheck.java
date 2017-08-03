package Chapter6Review;
//E6.7

import java.util.Scanner;

public class ValueCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Boolean first = true;
        int minimum = 0;

        while (in.hasNextInt()) {
            int value = in.nextInt();
            
            if (first) {
                minimum = value;
                first = false;
            } else if (value < minimum) {
                minimum = value;
            }

        }
        System.out.println(minimum);

    }

}
