package r418;

public class TilesQueueTester {

    public static void main(String[] args) {

        TilesQueue petit = new TilesQueue(5, 4, 100);

        System.out.println("This queue can fit: " + petit.getTiles() + " tiles");
        System.out.println("with a gap of " + petit.getGap() + " inches at each end.");
    }

}