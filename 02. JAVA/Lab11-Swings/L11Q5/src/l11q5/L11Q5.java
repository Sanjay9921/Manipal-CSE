package l11q5;

import javax.swing.*;

public class L11Q5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SwingAppl(); 
            }
	});
    }
    
}
