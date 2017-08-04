package Chapter5Review;

//E5.15
import java.util.Scanner;

public class DateTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = in.nextInt();
        System.out.print("Enter a day: ");
        int day = in.nextInt();

        Date alarm = new Date(month, day);

        System.out.println("Your alarm will trigger in " + alarm.getSeason());

    }
}
