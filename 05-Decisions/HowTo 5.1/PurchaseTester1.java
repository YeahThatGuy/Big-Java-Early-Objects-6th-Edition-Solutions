package Chapter5Review;

import java.util.Scanner;

public class PurchaseTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = in.nextDouble();
        System.out.print("Enter the discount value: ");
        double discount = in.nextDouble();

        Purchase item = new Purchase(price);
        item.applyDiscount(discount);
        System.out.println("The discounted price is: "
                + item.getDiscountedPrice());
    }
}
