import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CNICVAlidator implements ActionListener {
    JFrame frame;
    JLabel cnic;
    JTextField CNIC;
    JButton val;
    public void Render(){
        frame= new JFrame("validator");
        CNIC=new JTextField(16);
        cnic=new JLabel("Enter CNIC:");
        val=new JButton("Validate");
        Container c= frame.getContentPane();
        c.add(cnic);
        c.add(CNIC);
        c.add(val);
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);
        frame.setSize(300,300);
        val.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evt){
        String a=CNIC.getText();
        boolean validator=true;
        String[] spt=a.split("-");
        if(spt[0].length()!=5){
            validator=false;
        }else if (spt[1].length()!=7){
            validator=false;
        }else if (spt[2].length()!=1){
            validator=false;
        }
        if (Integer.parseInt(spt[0])<0&&Integer.parseInt(spt[0])>=69999){
            validator=false;
        }
        if (Integer.parseInt(spt[1])<0&&Integer.parseInt(spt[1])>=9999999){
            validator=false;
        }
        if (Integer.parseInt(spt[2])<0&&Integer.parseInt(spt[2])>9){
            validator=false;
        }


        if (validator==false){
            JOptionPane.showMessageDialog(null,"CNIC is wrong");
        }
        else
            JOptionPane.showMessageDialog(null,"CNIC is valid");
    }
    public CNICVAlidator(){
        Render();
    }
}
