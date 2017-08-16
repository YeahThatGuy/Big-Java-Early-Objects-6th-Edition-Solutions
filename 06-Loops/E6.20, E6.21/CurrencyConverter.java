package Chapter6Review;

//E6.20, E6.21
public class CurrencyConverter {

    private double exchangeRate;
    private double target;
    private double convertedValue;

    public CurrencyConverter(double exchangeRate, double target) {
        this.exchangeRate = exchangeRate;
        this.target = target;
        this.convertedValue = 0;
    }

    public void convertCurrency() {
        convertedValue = exchangeRate * target;
    }

    public double getCurrency() {
        return convertedValue;
    }

}
