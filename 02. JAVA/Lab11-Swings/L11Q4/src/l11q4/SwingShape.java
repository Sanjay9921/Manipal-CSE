package l11q4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingShape extends JPanel{
    
    int x,y,p,q;
    static JFrame jfrm;
    static JButton btnRect,btnCircle,btnArc,btnLine;
    static JLabel lblArea;
    
    static int select_code;
    
    SwingShape(){
        
        select_code = 0;
        x=0; y=0; p=0; q=0;
        
        btnRect=new JButton("Rect");
        btnCircle=new JButton("circle");
        btnArc=new JButton("arc");
        btnLine=new JButton("line");
        
        lblArea = new JLabel("Area of rectangle: ");
        
        btnRect.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                select_code = 0;
            }
        });
        
        btnCircle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                select_code = 1;
            }
        });
        
        btnArc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                select_code = 2;
            }
        });
        
        btnLine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                select_code = 3;
            }
        });
        
        this.add(btnRect); 
        this.add(btnCircle);
        this.add(btnArc);
        this.add(btnLine);
        
        this.add(lblArea);
        
 	addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x=me.getX();
                y=me.getY();
            }
        });
        
 	addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                p=me.getX();
                q=me.getY();
                repaint();		
            }
        });
        
        jfrm = new JFrame("Drawing Shapes");
        jfrm.add(this);
        jfrm.pack();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500,600);
        jfrm.setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.blue);
        
        switch(select_code){
            case 0:
                g.fillRoundRect(x,y,(p-x),(q-y),10,15);
                lblArea.setText("Area of Rectangle: " + Math.abs((p-x)*(q-y)/(37.8 * 37.8)));
                break;
            case 1:
                g.fillOval(x,y,(p-x),(p-x));
                lblArea.setText("Area of Circle: " + Math.abs(Math.PI * (p-x)*(q-y)/(37.8 * 37.8)));
                break;
            case 2:
               g.fillArc(x,y,(p-x),(q-y),0,90);
               lblArea.setText("Area of Arc: " + Math.abs(Math.PI * (p-x)*(q-y)/(37.8 * 37.8 * 4)));
               break;
            case 3:
               g.drawLine(x,y,p,q);
               double val = Math.pow((p-x),2) + Math.pow((q-y),2);
               lblArea.setText("Length of Line: " + Math.sqrt(val)/37.8);
               break;
        }
    }
}