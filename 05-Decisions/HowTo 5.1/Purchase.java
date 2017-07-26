package Chapter5Review;

public class Purchase {

    private double price;

    public Purchase(double price) {
        this.price = price;
    }

    public void applyDiscount() {
        final double MAX_DISCOUNT = 100;
        final double DISCOUNT_REFERENCE = 128;
        double discount;
        if (price < DISCOUNT_REFERENCE) {
            discount = 8;
        } else {
            discount = 16;
        }
        price = ((MAX_DISCOUNT - discount) / 100) * price;
    }

    public double getDiscountedPrice() {
        return price;
    }
}
