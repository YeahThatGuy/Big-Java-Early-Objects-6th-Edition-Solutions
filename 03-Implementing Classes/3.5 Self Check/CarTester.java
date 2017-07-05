package Ch3Review;

public class CarTester {

    public static void main(String[] args) {

        Car myCar = new Car(10);
        myCar.addGas(5);
        myCar.addGas(10);
        myCar.drive(100);
        myCar.drive(10);
        System.out.println("Gas left: " + myCar.getGasAmount() + " litres");
        System.out.println("Distance driven: " + myCar.getKilometresDriven() + " kilometres");
    }
}