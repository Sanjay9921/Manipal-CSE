package l11q1;

import javax.swing.*;

public class SwingDemo {
    JFrame jfrm;
    JLabel jlab;
    
    public SwingDemo(){
        jfrm = new JFrame("Simple Swing Demo");
        jfrm.setSize(300, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jlab = new JLabel("I am literally Ryan Gosling from Drive 2011.");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
}
