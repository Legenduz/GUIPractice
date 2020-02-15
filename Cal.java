import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cal implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    public Cal(){
        f=new JFrame("Adder / Multiplier");
        l1=new JLabel("No1: ");
        l2=new JLabel("No2: ");
        l3=new JLabel("Result:");
        t1=new JTextField(20);
        t2=new JTextField(20);
        rb1=new JRadioButton("+",true);
        rb2=new JRadioButton("*");
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        Container c=f.getContentPane();
        f.setLayout(new GridLayout(4,2));
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c  .add(t2);
        c.add(rb1);
        c.add(rb2);
        c.add(l3);
        c.setBackground(Color.RED);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        f.setVisible(true);
        f.setSize(300,300);

    }
    public void actionPerformed(ActionEvent evt){
        if (rb1.isSelected()){
            l3.setText("Result: "+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
        }
        else{
            l3.setText("Result: "+(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
        }
    }
}
