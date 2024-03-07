package l11q5;

import java.awt.*;
import javax.swing.*;

public class SwingThread extends JPanel implements Runnable{
    String msg = "I am literally Ryan Gosling from Drive 2011.";
    Thread t;
    
    public SwingThread(){
        setBorder(
                BorderFactory.createLineBorder(Color.RED, 5)
        );
        
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run(){
        
        // while(true)
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
            }
            catch(InterruptedException e){}
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        char c = msg.charAt(0); // starting 1 character that will be appended at last
        msg = msg.substring(1, msg.length());
        msg += c;
        g.drawString(msg, 150, 100);
    }
}
