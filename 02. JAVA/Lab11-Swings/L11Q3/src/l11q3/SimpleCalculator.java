package l11q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator{
    JFrame jfrm;
    JPanel fieldPnl, lblPnl;
    JLabel lblSum, lblDiff, lblDiv, lblProd, lblRem;
    JButton btn1; // compute button
    JTextField txt1, txt2;
    
    public SimpleCalculator(){
        
        // Frame
        jfrm = new JFrame("Simple Calculator");
        jfrm.setSize(600,400);
        jfrm.setBackground(new Color(0xFC9EE));
        jfrm.setResizable(false);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridLayout(2,1));
        
        // Panel
        fieldPnl = new JPanel(new GridLayout(3,1));
        lblPnl = new JPanel(new GridLayout(5,1));
        
        // Text Fields
        txt1 = new JTextField(" ");
        txt1.setHorizontalAlignment(JTextField.CENTER);
        
        txt2 = new JTextField(" ");
        txt2.setHorizontalAlignment(JTextField.CENTER);
        
        // Labels
        lblSum = new JLabel("Displays sum", JLabel.CENTER);
        lblDiff = new JLabel("Displays diff", JLabel.CENTER);
        lblProd = new JLabel("Displays prod", JLabel.CENTER);
        lblDiv = new JLabel("Displays division", JLabel.CENTER);
        lblRem = new JLabel("Displays remainder", JLabel.CENTER);
        
        // Buttons
        btn1 = new JButton("Compute");
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = 0.0, b = 0.0;
                double sum = 0.0, diff = 0.0, prod = 0.0, div = 0.0, rem = 0.0;

                try{
                    a = Double.parseDouble(txt1.getText());
                    b = Double.parseDouble(txt2.getText());
                    
                    sum = a+b;
                    diff = a-b;
                    prod = a*b;
                    div = a/b;
                    rem = a%b;
                }
                catch(NumberFormatException nfe){
                    String objMsg = "Number Format Exception: " + nfe; // object message
                    String errTitle = "Error";
                    JOptionPane.showMessageDialog(null, objMsg, errTitle, JOptionPane.ERROR_MESSAGE);
                }
                catch(ArithmeticException ae){
                    String objMsg = "Arithmetic Exception: " + ae; // object message
                    String errTitle = "Error";
                    JOptionPane.showMessageDialog(null, objMsg, errTitle, JOptionPane.ERROR_MESSAGE);
                }
                finally{
                    lblSum.setText(" " + String.format("%.2f",a) + " + " + String.format("%.2f",b) + " = " + String.format("%.2f",sum));
                    
                    lblDiff.setText(" " + String.format("%.2f",a) + " - " + String.format("%.2f",b) + " = " + String.format("%.2f",diff));
                    
                    lblProd.setText(" " + String.format("%.2f",a) + " * " + String.format("%.2f",b) + " = " + String.format("%.2f",prod));
                    
                    lblDiv.setText(" " + String.format("%.2f",a) + " / " + String.format("%.2f",b) + " = " + String.format("%.2f",div));
                    
                    lblRem.setText(" " + String.format("%.2f",a) + " % " + String.format("%.2f",b) + " = " + String.format("%.2f",rem));
                }
            }
        });
        
        // Panel addition
        fieldPnl.add(txt1);
        fieldPnl.add(txt2);
        fieldPnl.add(btn1);
        
        lblPnl.add(lblSum);
        lblPnl.add(lblDiff);
        lblPnl.add(lblProd);
        lblPnl.add(lblDiv);
        lblPnl.add(lblRem);
        
        // Frame addition
        jfrm.add(fieldPnl);
        jfrm.add(lblPnl);
        jfrm.setVisible(true);
    }
}
