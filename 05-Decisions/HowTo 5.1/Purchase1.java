package Chapter5Review;

public class Purchase {
    
    private double price;
    
    public Purchase(double price) {
        this.price = price;
    }
    
    public void applyDiscount(double discount) {
        final double MAX_DISCOUNT = 100;
        price = ((MAX_DISCOUNT - discount)/100) * price;
    }
    
    public double getDiscountedPrice() {
        return price;
    }
}
