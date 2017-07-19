package Review3;

//R3.11
public class Employee {
    
    private String name;
    private double salary;
    
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    
    public void raiseSalary(double byPercent) {
        salary = (salary * (byPercent / 100)) + salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }

}
