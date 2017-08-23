package Chapter6Review;

//E6.6
import java.util.Scanner;

public class DataSetTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        DataSet newSet = new DataSet();

        System.out.println("Enter a set of values, Q to quit: ");
        
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            newSet.add(value);
        }

        System.out.printf("The average of this set is: %4.2f%n", newSet.getAverage());
        System.out.printf("The smallest of this set is: %4.2f%n",
                newSet.getSmallest());
        System.out.printf("The largest of this set is: %4.2f%n",
                newSet.getLargest());
        System.out.printf("The range of this set is: %4.2f%n",
                newSet.getRange());
    }
}
