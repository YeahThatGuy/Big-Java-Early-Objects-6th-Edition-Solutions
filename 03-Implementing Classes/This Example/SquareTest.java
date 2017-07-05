package Ch3Review;

public class SquareTest {

    public static void main(String args[]) {

        Square petit = new Square(2);
        int result = petit.getArea();
        
        petit.grow();
        int result2 = petit.getArea();

        System.out.println(result);
        System.out.println(result2);
    }
}
