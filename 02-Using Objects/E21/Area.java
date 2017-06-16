package Ch2Exercises.R21;

import java.awt.Rectangle;

public class Area {

    private int width;
    private int height;
    private int x;
    private int y;

    public Area() {
        //default values if Area class rectangle doesn't receive any arguments
        Rectangle rectangle2 = new Rectangle(10, 10, 30, 30);
        x = rectangle2.x;
        y = rectangle2.y;
        width = rectangle2.width;
        height = rectangle2.height;
    }

    public Area(int aX, int aY, int aWidth, int aHeight) {
        //receives values for the Area class rectangle from the main class
        x = aX;
        y = aY;
        width = aWidth;
        height = aHeight;
    }

    public int calculateArea() {
        int rectangleArea = width * height;
        return rectangleArea;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
