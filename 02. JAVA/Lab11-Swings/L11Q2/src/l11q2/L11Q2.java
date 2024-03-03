package l11q2;

import javax.swing.*;

public class L11Q2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ButtonDemo();
            }
        });
    }
}
