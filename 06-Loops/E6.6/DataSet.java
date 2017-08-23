package Chapter6Review;

//E6.6
public class DataSet {

    private double value;
    private double sum = 0;
    private int counter = 0;
    private double smallest;
    private double largest;
    private Boolean firstRun = true;

    public DataSet() {

    }

    public void add(double aValue) {
        value = aValue;
        sum = sum + value;
        counter++;

        if (firstRun) {
            smallest = value;
            largest = value;
            firstRun = false;
        } else if (!firstRun && smallest > value) {
            smallest = value;
        } else if (!firstRun && largest < value) {
            largest = value;
        }

    }

    public double getAverage() {
        double average = sum / counter;
        return average;
    }

    public double getSmallest() {
        return smallest;
    }

    public double getLargest() {
        return largest;
    }

    public double getRange() {
        double range = largest - smallest;
        return range;
    }

}
