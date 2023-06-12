import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Start extends JFrame implements ActionListener {

  JButton startgame = new JButton("Start");
  JButton rules = new JButton("Rules");
  JButton quit = new JButton("Quit");
  JLabel player1Label = new JLabel("Player 1");
  JLabel player2Label = new JLabel("Player 2");
  JTextField player1 = new JTextField();
  JTextField player2 = new JTextField();
  public String name1;
  public String name2;
  
  


  public void showDialog() {
    setLayout(null);

    player1.setBounds(15, 100, 250, 20);
    player2.setBounds(15, 150, 250, 20);
    player1Label.setBounds(15, 80, 250, 20);
    player2Label.setBounds(15, 130, 250, 20);
    startgame.setBounds(35, 185, 200, 40);
    rules.setBounds(35, 240, 200, 40);
    quit.setBounds(35, 295, 200, 40);

    this.add(player1);
    this.add(player2);
    this.add(player1Label);
    this.add(player2Label);
    this.add(startgame);
    this.add(rules);
    this.add(quit);

    startgame.addActionListener(this);
    rules.addActionListener(this);
    quit.addActionListener(this);
  
    setTitle("FailureChess");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(280,400);
    setVisible(true); 

    }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == startgame) {
      name1 = player1.getText();
      name2 = player2.getText();
      GameView gameView = new GameView(name1, name2);
      dispose();
      
    } else if (e.getSource() == quit) {
      dispose();
    } else if (e.getSource() == rules) {
      Rules gui = new Rules();
      gui.showDialog();;
    }
    
  }

}