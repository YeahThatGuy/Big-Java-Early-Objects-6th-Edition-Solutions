package ch1;

import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance to your destination: ");
        int distance = sc.nextInt();
        System.out.print("What's the fuel efficiency of your car (in MPG): ");
        double mpg = sc.nextInt();
        System.out.print("What's the price of a train ticket: ");
        double trainCost = sc.nextDouble();

        //cost of gas per gallon ($)
        double gasCost = 4;
        //cost of car maintenance per mile
        double maintenanceCost = 0.05;

        double maintenance = maintenanceCost * distance;
        double gasDistance = Math.ceil((distance / mpg)) * gasCost;
        double carCost = maintenance + gasDistance;

        if (carCost < trainCost) {
            System.out.println("It will be cheaper to take the car ($" + carCost + ") than the train"
                    + " ($" + trainCost + ").");
        } else {
            System.out.println("It will be cheaper to take the train ($" + trainCost + ") than the car "
                    + "($" + carCost + ").");
        }

    }

}