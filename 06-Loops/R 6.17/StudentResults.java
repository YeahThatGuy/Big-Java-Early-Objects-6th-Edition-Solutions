package Chapter6Review;

//R6.17
import java.util.Scanner;

public class StudentResults {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int sum = 0;
        Boolean checker = true;

        while (checker) {

            System.out.print("Enter your first name, END to quit: ");
            firstName = in.next();
            if (firstName.equals("END")) {
                checker = false;
                break;
            }

            System.out.print("Enter your last name, END to quit: ");
            lastName = in.next();
            if (lastName.equals("END")) {
                checker = false;
                break;
            }

            while (!((firstName.equals("END")) || (lastName.equals("END")))) {
                System.out.print("Enter your test mark, type -1 to quit: ");
                int mark = in.nextInt();
                if (mark != -1) {
                    sum = sum + mark;
                } else {
                    break;
                }

            }
            System.out.printf("The sum of marks for %s %s is %8d %n", firstName, lastName, sum);
            sum = 0;
        }
    }
}