import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class DisplayTextAndImage extends JFrame {
    public DisplayTextAndImage() {
        setTitle("Text and Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JLabel textLabel = new JLabel("Hello, Java!");
        add(textLabel);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < 300; y++) {
            for (int x = 0; x < 400; x++) {
                int red = (x * 255) / 400;
                int green = 120 + (y * 80) / 300;
                int blue = 220 - (x * 50) / 400;
                image.setRGB(x, y, new Color(red, green, blue).getRGB());
            }
        }

        JLabel imageLabel = new JLabel(new ImageIcon(image));
        add(imageLabel);

        setSize(600, 420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DisplayTextAndImage());
    }
}
