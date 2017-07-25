package SelfCheck5;

import java.util.Scanner;

public class FuelControl {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Specify the size of the fuel tank: ");
        double fuelCapacity = in.nextDouble();
        System.out.print("The following amount of fuel is in the "
                + "fuel tank: ");
        double fuelAmount = in.nextDouble();

        double fuelLeft = (fuelAmount * 100.0) / fuelCapacity;
        final double FUEL_WARNING = 10;
        String statusLight = "";

        if (fuelLeft < FUEL_WARNING) {
            statusLight = "red";
        } else {
            statusLight = "green";
        }

        System.out.println("The statusLight for " + fuelAmount + " litres"
                + " of fuel or " + fuelLeft + "% is: " + statusLight);

    }
}
