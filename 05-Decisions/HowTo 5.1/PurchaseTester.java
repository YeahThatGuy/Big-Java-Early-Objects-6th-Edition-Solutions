package Chapter5Review;

import java.util.Scanner;

public class PurchaseTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = in.nextDouble();

        Purchase item = new Purchase(price);
        item.applyDiscount();
        System.out.println("The discounted price is: "
                + item.getDiscountedPrice());
    }
}
