//program constructs a custom Rectangle object via the personal class Area
//the main method in the main class, AreaTester, calls references from the supporting class Area.java
//this is an attempt to write in an OOP style, encapsulation hasn't been used here yet

package Ch2Exercises.R21;

import java.awt.Rectangle;

public class AreaTester {

    public static void main(String[] args) {
        Area rectangle = new Area(5, 10, 15, 20);
        //constructed object in the Area class
        Area rectangle2 = new Area();

        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println("Area of the rectangle is: " + rectangle.calculateArea());

        System.out.println(rectangle2.getX());
        System.out.println(rectangle2.getY());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());
        System.out.println("Area of the rectangle is: " + rectangle2.calculateArea());

    }

}