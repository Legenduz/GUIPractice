import java.awt.*;
import javax.swing.*;
public class SimpleCalculator {
    JFrame frame;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDecimal,btnPlus,btnMinus,btnMultiply,btnDevide,btnEqual;
    JTextField tf;
    JLabel label;
    public void  RenderUI(){
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");
        btnDecimal=new JButton(".");
        btnPlus=new JButton("+");
        btnMinus=new JButton("-");
        btnMultiply=new JButton("*");
        btnDevide=new JButton("/");
        btnEqual=new JButton("=");


        JPanel panel=new JPanel(new GridLayout(4,4));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnDevide);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMinus);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMultiply);
        panel.add(btnDecimal);
        panel.add(btn0);
        panel.add(btnEqual);
        panel.add(btnPlus);
        tf=new JTextField(30);
        label=new JLabel("Answer");
        frame=new JFrame("Simple Calculator");
        frame.setLayout(new BorderLayout());
        Container c=frame.getContentPane();
        c.add(tf,BorderLayout.NORTH);
        c.add(panel,BorderLayout.CENTER);
        c.add(label,BorderLayout.SOUTH);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
    public SimpleCalculator(){
        RenderUI();
    }
}
