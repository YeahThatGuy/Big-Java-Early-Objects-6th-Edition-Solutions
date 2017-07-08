package Review3;

//P3.3

public class BalloonTester {

    public static void main(String args[]) {

        Balloon rubbery = new Balloon();

        rubbery.inflate(2);

        System.out.println("Expected volume: 33.5");
        System.out.println("Actual volume: " + rubbery.getVolume());
    }

}