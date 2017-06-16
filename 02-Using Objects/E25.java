package PracticeAnswers;

import java.awt.Rectangle;

public class E25 {
    public static void main(String[] args) {
        
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println(box);
        
        box.add(0, 0);
        System.out.println(box);
        System.out.println("Actual x = " + box.getX());
        System.out.println("Actual y = " + box.getY());
        System.out.println("Actual width = " + box.getWidth());
        System.out.println("Actual height = " + box.getHeight());
        
        System.out.println("Expected width = 20.0");
        System.out.println("Expected height = 30.0");
    }
    
}
