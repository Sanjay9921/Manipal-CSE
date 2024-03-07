package l11q6;

import javax.swing.*;

public class SwingCircle extends JPanel{
    JFrame jfrm;
    PPanel pp;
    
    public SwingCircle(){
        jfrm = new JFrame("Random Circle");
        pp = new PPanel();
        jfrm.setSize(500, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.add(pp);
        pp.setVisible(true);
        jfrm.setVisible(true);
    }
}
