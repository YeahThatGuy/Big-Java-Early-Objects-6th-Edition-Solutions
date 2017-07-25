package Chapter5Review;

//E5.10

import java.util.Scanner;

/**
 * Calculates the weekly paycheck, accounting for overtime
 * @author josan.c
 */
public class Paycheck {

    private String name = "";
    private double salaryPerHour;
    private double hours;
    private double salary;
    
    /**
     * Constructor an employee profile for paycheck
     * @param name the name of the employee
     * @param salaryPerHour the hourly wage
     * @param hours the worked hours in a week
     */
    public Paycheck(String name, double salaryPerHour, double hours) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }
    
    /**
     * Calculates the weekly paycheck
     */
    public void deducePaycheck() {
        final double OVERTIME = 40;
        final double OVERTIME_RATE = 1.5;
        salary = salaryPerHour * hours;
        if (hours > OVERTIME) {
            salary = (salaryPerHour * OVERTIME)
                    + (salaryPerHour * (hours - OVERTIME) * OVERTIME_RATE);
        } else {
            salary = salaryPerHour * hours;
        }
    }
    
    /**
     * Gets the weekly salary
     * @return the weekly salary
     */
    public double getPaycheck() {
        return salary;
    }

}
