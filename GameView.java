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


public class GameView extends JFrame {

    public GameView(String name1, String name2)  {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new BoardPanel());        
        setGlassPane(new PiecesPanel()); 
        getGlassPane().setVisible(true);
        pack();
        setVisible(true);
    }

  
}

class BoardPanel extends JPanel {

    public static final int LENGTH = 6;
    private final Color[] COLOR_ARRAY = {Color.decode("#ffffff"), Color.decode("#000000")};

    public BoardPanel()   {
        setLayout(new GridLayout(LENGTH, LENGTH));
        int numView = 1;
        for (int i = 0; i < LENGTH; i++)
        {
            numView = (numView == 0) ? 1:0;
            for (int j = 0; j < LENGTH; j++)
            {
                add(new TileView(COLOR_ARRAY[numView]));
                numView = (numView == 0) ? 1:0;
            }
        }
    }
}


class PiecesPanel extends JPanel {

    public static final int LENGTH = 6;
    PiecesPanel(){

        setOpaque(false); 
        setLayout(new GridLayout(LENGTH, LENGTH));

    }
}

class TileView extends JLabel {

    public static final int SIZE = 100;
    TileView(Color color) {
        setPreferredSize(new Dimension(SIZE, SIZE));
        setOpaque(true);
        setBackground(color);
    }
}











