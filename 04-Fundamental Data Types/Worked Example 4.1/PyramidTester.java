package worked_example_1;

public class PyramidTester {

    public static void main(String[] args) {
        Pyramid sample = new Pyramid(10, 10);
        System.out.printf("%.2f", sample.getVolume());
        System.out.println();
        System.out.println("Expected: 323.61");
        System.out.printf("%.2f", sample.getSurfaceArea());
        System.out.println();
        System.out.println("Expected: 224");

        Pyramid gizeh = new Pyramid(146, 230);
        System.out.printf("%.2f", gizeh.getVolume());
        System.out.println();
        /* 
         The following estimate is from 
         http://en.wikipedia.org/wiki/Great_Pyramid_of_Giza, citing
         Levy, Janey (2005). The Great Pyramid of Giza: 
         Measuring Length, Area, Volume, and Angles. Rosen 
         Publishing Group. ISBN 1404260595.
         */
        System.out.println("Expected: 2574466.67");
    }
}
