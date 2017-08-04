package Chapter6Review;

//Self Check 6.14

public class SumOfIntegers {

    private int boundary;
    private int sum;

    public SumOfIntegers(int aBoundary) {
        boundary = aBoundary;
        sum = 0;
    }

    public void calculateSum() {
        for (int i = 1; i < boundary; i++) {
            sum = sum + i;
        }
    }

    public int getSum() {
        return sum;
    }
}
