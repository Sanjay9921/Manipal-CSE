package l11q6;

import javax.swing.*;

public class L11Q6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SwingCircle(); 
            }
	});
    }
    
}
