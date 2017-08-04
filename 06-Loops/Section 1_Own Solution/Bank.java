package Chapter6Review;

public class Bank {

    private double principal;
    private double interest;
    private int year;
   
    public Bank(double principal, double interest) {
        this.principal = principal;
        this.interest = interest;
    }

    public void calculateFV(double targetPayout) {
        interest = interest / 100;
        for (year = 0; principal < targetPayout; year++) {
            principal = (principal * interest) + principal;
            System.out.printf("%.2f %9d%n", principal, year); //%n instead of \n for a new line
        }
    }

    public double getFV() {
        return principal;
    }

    public int getYears() {
        return year;
    }
}
