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
        System.out.println("House length: ");
        double length = sc.nextDouble();
        System.out.println("House width: ");
        double width = sc.nextDouble();
        System.out.println("House height: ");
        double height = sc.nextDouble();
        System.out.println("Number of doors: ");
        double noDoors = sc.nextDouble();
        System.out.println("Door length: ");
        double dLength = sc.nextDouble();
        System.out.println("Door width: ");
        double dWidth = sc.nextDouble();
        System.out.println("Door height: ");
        double dHeight = sc.nextDouble();
        System.out.println("Number of windows: ");
        double noWindows = sc.nextDouble();
        System.out.println("Window length: ");
        double wLength = sc.nextDouble();
        System.out.println("Window width: ");
        double wWidth = sc.nextDouble();
        System.out.println("Window height: ");
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
        
    }

}