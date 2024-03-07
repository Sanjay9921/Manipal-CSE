package l11q6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class PPanel extends JPanel{
    JLabel lbl;
    int x,y,p,q;
    NumberFormat nf;
    
    public PPanel(){
        
        // Init
        x = 0; y = 0; p = 0; q = 0;
        
        // Label
        lbl = new JLabel("Ryan Literally Me Gosling");
        
        this.add(lbl);
        this.setSize(400, 200);
        
        nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x = me.getX();
                y = me.getY();
            }
        });
        
        this.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                p = me.getX();
                q = me.getY();
                repaint();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g); // removes the GUI glitch of multiple circles
        g.drawOval(x, y, (p-x), (q-y));
        double r = (p-x)/(2*37.8);
        double area = 3.14 * Math.pow(r, 2);
        lbl.setText("Radius: " + nf.format(r) + " | Area of circle: " + nf.format(area));
    }
}
