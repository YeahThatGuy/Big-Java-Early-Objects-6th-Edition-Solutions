//the program will draw a rectangle in a JFrame (new window)
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        g.drawRect(100, 100, 20, 20);
    }
}

public class DrawRect {

    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);

    }
}