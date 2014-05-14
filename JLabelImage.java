import java.awt.*;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * A small class to demonstrate the usage of jLabels to store images. It will create read from an image named "image.jpg" that is found in the same directory as the class.
 * @author George
 */
public class JLabelImage extends JFrame{

    JLabel image;
    
    /**
     * Constructor. Called to create an instance of this class.
     */
    public JLabelImage() {
        super("Image Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(240, 200));
        setLayout(new GridLayout(2, 2));
        image = new JLabel();
        
        try { //This is the block of code that reads the image.
            InputStream is = JLabelImage.class.getResourceAsStream("image.jpg"); //Creates an InputStream and points it at a file named "image.jpg" in the same directory.
            Image tempImage = ImageIO.read(is); //Reads the image and stores it.
            image.setIcon(new ImageIcon(tempImage)); //Sets the jLabel image to display the stored image.
        }
        catch(Exception e) { //Catches any exceptions.
            System.err.println(e);
        }

        getContentPane().add(image);
        setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JLabelImage example = new JLabelImage();
    }
    
}
