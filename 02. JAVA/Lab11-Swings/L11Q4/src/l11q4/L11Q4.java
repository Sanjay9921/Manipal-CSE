package l11q4;

import javax.swing.*;

public class L11Q4 {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SwingShape(); 
            }
	});
     }
}
