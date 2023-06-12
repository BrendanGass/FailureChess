import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GameView extends JFrame implements ActionListener {
      private JPanel pnl1 = new JPanel();
      private JPanel pnl2 = new JPanel();
      private Panel[] panels1 = new Panel[5];
      private Panel[] panels2 = new Panel[5];
      private JScrollPane scrollpane1 = new JScrollPane (pnl1,                                                     JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
          JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      private JScrollPane scrollpane2 = new JScrollPane (pnl2,                                                     JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
          JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

      private JButton roundnew = new JButton("start a new round");
      private JButton quit = new JButton("Quit");
      private JButton next = new JButton("Next");
      private JButton dice = new JButton("Dice!");
      private JLabel player1 = new JLabel();
      private JLabel player2 = new JLabel();
      private int y = 0;
  

      public GameView(String name1, String name2) {
        this.setLayout(null);
        pnl1.setLayout(null);
        pnl2.setLayout(null);
        this.setTitle("CyberDice");

        scrollpane1.setBounds(20, 100, 300, 500);
        scrollpane2.setBounds(370, 100, 300, 500);
        roundnew.setBounds(510, 610, 170, 40);
        quit.setBounds(10, 610, 170, 40);
        dice.setBounds(190, 610, 85, 40);
        next.setBounds(285, 610, 215, 40);
        player1.setBounds(20, 30, 300, 20);
        player2.setBounds(370, 30, 300, 20);

        this.add(scrollpane1);
        this.add(scrollpane2);
        this.add(roundnew);
        this.add(quit);
        this.add(next);
        this.add(dice);
        this.add(player1);
        this.add(player2);
        player1.setText(String.valueOf(name1));
        player2.setText(String.valueOf(name2));

        roundnew.addActionListener(this);
        quit.addActionListener(this);
        next.addActionListener(this);
        dice.addActionListener(this);

        this.setSize(690, 690);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

      }
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == roundnew) {
          Start gui = new Start();
          gui.showDialog();
          dispose();
        
      
        } else if (e.getSource() == quit) {
          dispose();
          
        } else if (e.getSource() == this.next) {
          panels1[0] = new Panel();
          panels1[0].setBounds(0, y, 350, 60);
          y += 61; 
          pnl1.add(panels1[0]); 
          this.repaint();
          
         }  else if (e.getSource() == dice) {
            Logic dice = new Logic();
            System.out.println(dice.rollTheDice());
          
        }
  
      }
        
}

// My gf is hot






