import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class Piece extends JLabel{

    Piece() {

        URL url = null;
        try {
            url = new URL("https://dl1.cbsistatic.com/i/r/2017/08/15/9b37ca73-de21-4998-ae7a-07d2915a551e/thumbnail/64x64/0cd91f1c045919af6bdafab3a6f07f99/imgingest-6339051052035379444.png");
        } catch (MalformedURLException ex) { ex.printStackTrace();  }
        setIcon(new ImageIcon(url));
        setVerticalTextPosition(SwingConstants.BOTTOM);
        setHorizontalTextPosition(SwingConstants.CENTER);
    }
}
  
