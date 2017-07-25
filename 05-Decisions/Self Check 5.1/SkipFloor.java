package SelfCheck5;

import java.util.Scanner;

//Self Check 5.1
public class SkipFloor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the desired floor: ");
        int floor = in.nextInt();

        int actualFloor;
        if (floor > 14) {
            actualFloor = floor - 2;
        } else {
            actualFloor = floor;
        }

        System.out.println("Actual floor is: " + actualFloor);
    }

}
