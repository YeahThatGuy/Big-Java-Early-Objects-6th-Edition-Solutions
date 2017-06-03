package housepaint;

/* R1.15 
 Scanner (width, length, height, noDoors, noWindows, dwWidth, dwLength, dwHeight)
 Loop:
 for doors (calculate total surface area)
 for windows (calculate total surface area)
 Calculate house total surface area
 Subtract doors+windows total surface area from house total surface area

 Assumes that all objects are rectangular prisms.

 http://www.math.com/tables/geometry/surfareas.htm */
import java.util.Scanner;

public class HousePaint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("House length: ");
        double length = sc.nextDouble();
        System.out.print("House width: ");
        double width = sc.nextDouble();
        System.out.print("House height: ");
        double height = sc.nextDouble();
        System.out.print("Number of doors: ");
        double noDoors = sc.nextDouble();
        System.out.print("Door length: ");
        double dLength = sc.nextDouble();
        System.out.print("Door width: ");
        double dWidth = sc.nextDouble();
        System.out.print("Door height: ");
        double dHeight = sc.nextDouble();
        System.out.print("Number of windows: ");
        double noWindows = sc.nextDouble();
        System.out.print("Window length: ");
        double wLength = sc.nextDouble();
        System.out.print("Window width: ");
        double wWidth = sc.nextDouble();
        System.out.print("Window height: ");
        double wHeight = sc.nextDouble();
        sc.close();

        double doorsTotal = 0;
        double windowsTotal = 0;
        double houseArea = 0;
        double housePaint = 0; //surface area sans doors and windows

        for (double cuntD = 0; cuntD < noDoors; cuntD++) {
            doorsTotal = ((2 * dWidth * dHeight) + (2 * dHeight * dLength) + (2 * dWidth * dLength)) + doorsTotal;
            System.out.println(doorsTotal);
        }

        for (double cuntW = 0; cuntW < noWindows; cuntW++) {
            windowsTotal = ((2 * wWidth * wHeight) + (2 * wHeight * wLength) + (2 * wWidth * wLength)) + windowsTotal;
            System.out.println(windowsTotal);
        }
        
        houseArea = (2 * width * height) + (2 * height * length) + (2 * width * length);
        housePaint = houseArea - (doorsTotal + windowsTotal);
        System.out.println("Total house are: " + houseArea);
        System.out.println("House area to be painted: " + housePaint + " m^2");
    }

}