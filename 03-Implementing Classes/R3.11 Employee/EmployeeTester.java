package Review3;


public class EmployeeTester {
    public static void main(String args[] ) {
        
        Employee Ben = new Employee("Bon Jovi", 30000);
        Ben.raiseSalary(20);
        
        System.out.println("Expected salary: 36000");
        System.out.println("Actual salary: " + Ben.getSalary());
        System.out.println("Name: " + Ben.getName());
    }
}
