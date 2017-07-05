//R3.16
package Ch3Review;

public class Square {

    private int sideLength;
    private int area;

    public Square(int initialLength) {
        sideLength = initialLength;
        area = sideLength * sideLength;
    }

    public int getArea() {
        this.area = sideLength * sideLength;
        return area;
    }

    public void grow() {
        sideLength = 2 * sideLength;
    }
}