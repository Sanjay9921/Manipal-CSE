package l11q3;

import javax.swing.*;

public class L11Q3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SimpleCalculator();
            }
        });
    }
    
}
