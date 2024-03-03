import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.io.*;
import java.util.*;

class Book extends JFrame { 
 
  JTextField t1,t2,t3,t4; 
  JButton b1,b2;
  JLabel n1,n2,n3,n4,n5;
public static void main(String args[]) {
SwingUtilities.invokeLater(
new Runnable() {
public void run() {
new Book();
}
});
}
 
    Book() { 
    super("MINI LIBRARY");
    setSize(180,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel fst = new JLabel("Book Details:"); 
    t1=new JTextField(10);
    t2=new JTextField(10);
    t3=new JTextField(10);
    b1=new JButton("CREATE");
    
    JLabel scnd = new JLabel("Enter book details to search:");
    t4=new JTextField(10);
    b2=new JButton("SEARCH");
    
    n1=new JLabel("Mili?? :      ");
    n2=new JLabel("Available hai? :      ");
    
    setLayout(new FlowLayout());
 
    add(fst); 
    add(t1);
    add(t2); 
    add(t3); 
    add(b1); 
    add(scnd);
    add(t4);
    add(b2);
    add(n1);
    add(n2);


        b1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String Name = t1.getText();
                String Author= t2.getText();
                String Price=t3.getText();


                BufferedWriter bw = null;

                try{
                    File f = new File("text.txt");

                    if (!f.exists()) {
                        f.createNewFile();
                    }

                    Writer write = new FileWriter(f,true);
                    bw = new BufferedWriter(write);
                    bw.write(Name+" "+Author+" "+Price+" "+"\n");
                    System.out.println("\n");


                }
                catch (IOException e1){System.out.println(e1);}
                finally {
                    try{
                        bw.close();
                    }
                    catch (IOException e2){System.out.println(e2);}
                    n1.setText("Entered");
                }

            }
        });


        b2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                File ff = new File("text.txt");
                try{
                    Scanner sc = new Scanner(ff);
                    while(sc.hasNextLine()){
                        String c = sc.nextLine();
                        if(c.contains(t4.getText()))
                            n2.setText("Found");
                        else
                            n2.setText("Not found");
                    }

                }
                catch(FileNotFoundException e1){System.out.println(e1);}


            }
        });

  
   
   setVisible(true);
  } 
  
}