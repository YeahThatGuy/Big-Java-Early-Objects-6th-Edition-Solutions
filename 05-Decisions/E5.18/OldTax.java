package Chapter5Review;

//E5.18

public class OldTax {

    private int income;

    public OldTax(int income) {
        this.income = income;
    }

    public double getTax() {
        double taxRate;
        double netIncome;

        if (income <= 50000) {
            taxRate = 0.01;
            netIncome = income * taxRate;
        } else if ((income > 50000) && (income <= 75000)) {
            taxRate = 0.02;
            netIncome = income * taxRate;
        } else if ((income > 75000) && (income <= 100000)) {
            taxRate = 0.03;
            netIncome = income * taxRate;
        } else if ((income > 100000) && (income <= 250000)) {
            taxRate = 0.04;
            netIncome = income * taxRate;
        } else if ((income > 250000) && (income <= 500000)) {
            taxRate = 0.05;
            netIncome = income * taxRate;
        } else {
            taxRate = 0.06;
            netIncome = income * taxRate;
        }

        return netIncome;
    }

}
