import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
public class MouseDemo implements MouseMotionListener {
    JLabel l;
    public void Render(){
        JFrame f=new JFrame("Coordinates");
        f.setSize(300,300);
        f.setVisible(true);
        Container c=f.getContentPane();
        l=new JLabel("(0,0)");
        c.add(l);
        f.setLayout(new FlowLayout());
        f.addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        l.setText("("+x+","+y+")");
    }
    public MouseDemo(){
        Render();
    }
}
