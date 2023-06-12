import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
public class Panel extends JPanel {
  JLabel lbl1 = new JLabel("6");
  JLabel lbl2 = new JLabel("2");
  JLabel lbl3 = new JLabel("4");
  JLabel lbl4 = new JLabel("4");
  JLabel lbl5 = new JLabel("2");

  public Panel() {
    this.setLayout(null);

    lbl1.setBounds(10, 10, 30, 30);
    lbl2.setBounds(40, 10, 30, 30);
    lbl3.setBounds(70, 10, 30, 30);
    lbl4.setBounds(100, 10, 30, 30);
    lbl5.setBounds(130, 10, 30, 30);

    add(lbl1);
    add(lbl2);
    add(lbl3);
    add(lbl4);
    add(lbl5);
    this.setBackground(Color.LIGHT_GRAY);

  }

}