//load image, resize and insert into popout
package e13;

import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E118 {

    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("https://vignette3.wikia.nocookie.net/logopedia/images/c/c7/P%26G_Established_1837.png/revision/latest?cb=20160821150238");
        Image image = ImageIO.read(imageLocation);
        image = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);

        JOptionPane.showMessageDialog(null, "Voila", "Generic",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
    }
}