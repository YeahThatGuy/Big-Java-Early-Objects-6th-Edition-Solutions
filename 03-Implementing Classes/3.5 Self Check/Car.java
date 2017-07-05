package Ch3Review;

public class Car {
    
    private int fuelConsumption;
    private int gasRefuel;
    private int drivingDistance;
    
    /**
     * Constructs a Car object with a given fuel efficiency (in litres per 100km)
     * @param gasEfficiency the fuel efficiency in litres per 100km
     */
        public Car(int gasEfficiency) {
        fuelConsumption = gasEfficiency;
    }
    
    /**
     * Adds gas to the tank and increments the gas counter
     * @param refuel the amount of gas to be added
     */
    public void addGas(int refuel) {
        gasRefuel = gasRefuel + refuel;
    }
    
    /**
     * Captures the distance to drive to a destination (in km)
     * @param distance the distance that was added to the distance counter (in km)
     */
    public void drive(int distance) {
        drivingDistance = drivingDistance + distance;
    }
    
    /**
     * Determines the amount of gas left in the tank after driving a certain distance
     * @return the amount of gas in the tank
     */
    public int getGasAmount() {
        return gasRefuel - ((fuelConsumption * drivingDistance) / 100);
    }
    
    public int getKilometresDriven() {
        return drivingDistance;
    }
}