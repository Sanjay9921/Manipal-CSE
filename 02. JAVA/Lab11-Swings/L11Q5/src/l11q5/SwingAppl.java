package l11q5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SwingAppl {
    JFrame jfrm;
    JLabel lbl;
    SwingThread pp; // paint panel custom class
    
    public SwingAppl(){
        
        // Label
        lbl = new JLabel("Scrolling Banner");
        
        // Panel
        pp = new SwingThread();
        
        // Frame
        jfrm = new JFrame("Swing Thread Scrolling Message Demo");
        jfrm.setSize(500, 350);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jfrm.add(pp, BorderLayout.CENTER);
        jfrm.add(lbl, BorderLayout.SOUTH);
        
        jfrm.setVisible(true);
    }
}
