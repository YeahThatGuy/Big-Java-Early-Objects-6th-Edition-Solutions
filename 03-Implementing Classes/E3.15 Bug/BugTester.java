package Review3;

//E3.15

public class BugTester {

    public static void main(String args[] ) {
        
        Bug fly = new Bug(5);
        fly.move(); //6
        fly.move(); //7
        fly.move(); //8
        fly.turn(); //to left
        fly.move(); //7
        fly.turn(); //to right
        fly.move(); //8
        
        System.out.println("Expected position: 8");
        System.out.println("Actual position: " + fly.getPosition());
    }
    
}
