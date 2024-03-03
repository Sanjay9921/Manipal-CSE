package l11q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo implements ActionListener{
    JFrame jfrm;
    JLabel jlab;
    JButton btn1, btn2;
    
    public ButtonDemo(){
        
        // JFrame
        jfrm = new JFrame("Swing Push Button Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // JLabel
        jlab = new JLabel("Which Ryan Gosling are you feeling today? ");
        
        // Buttton
        btn1 = new JButton("Drive 2011");
        btn2 = new JButton("Blade Runner 2049");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
         
        // Adding components to frame
        jfrm.add(btn1);
        jfrm.add(btn2);
        jfrm.add(jlab);
        jfrm.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Drive 2011")){
            jlab.setText("I drive.");
        }
        else{
            jlab.setText("You look lonely, I can fix you. (I need a job please)");
        }
    }
}
