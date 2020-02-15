import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Temperature implements ActionListener {
    JRadioButton b1,b2;
    JButton b3;
    JTextField t1;
    public void Render() {
        JFrame f = new JFrame("Temperature Converter");
        Container c = f.getContentPane();
        f.setLayout(new GridLayout(5, 1));
        f.setVisible(true);
        b1 = new JRadioButton("Celcius to Farenheit", true);
        b2 = new JRadioButton("Farenheit to Celcius");
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        b3 = new JButton("Convert");
        JLabel l1 = new JLabel("Enter Temperature");
        t1 = new JTextField(30);
        f.setSize(300, 300);
        c.add(l1);
        c.add(t1);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        f.pack();
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b3){
            if (b1.isSelected()){
                float f= Float.parseFloat(t1.getText());
                float ans=(f*9/5+32);
                t1.setText(ans+"");
            }
            if (b2.isSelected()){
                float f= Float.parseFloat(t1.getText());
                float ans=(f-32)*5/9;
                t1.setText(ans+"");
            }
        }
    }
    public Temperature(){
        Render();
    }
}
