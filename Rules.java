import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {


  JButton quit = new JButton("Back");
  JLabel rules = new JLabel();
  
  


  public void showDialog() {
    setLayout(null);


    rules.setBounds(30, 10, 340, 250);
    quit.setBounds(100, 295, 200, 40);


    this.add(rules);
    this.add(quit);


    quit.addActionListener(this);
    rules.setText("<html>Just the normal chess rules. I hope you at least know these otherwise you won't be playing this for long...</html>");
    setTitle("FailureChess Rules");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true); 

    }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == quit) {
      dispose();
    }
  }

}