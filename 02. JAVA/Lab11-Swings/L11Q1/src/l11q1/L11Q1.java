package l11q1;

import javax.swing.*;

public class L11Q1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SwingDemo();
            }
        });
    }
    
}
