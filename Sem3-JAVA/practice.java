import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class practice
{
    practice()
    {
        final JLabel name,author,action;
        final JTextField fname,fauthor;
        JButton Enter,Search;

        JFrame jfrm = new JFrame("Mini Library");
        jfrm.setSize(400,400);
        jfrm.setLayout(new GridLayout(0,1));
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        name = new JLabel("Name");
        author = new JLabel("Author");
        action = new JLabel("Action:");
        fname = new JTextField("");
        fauthor = new JTextField("");

        Enter = new JButton("Enter");
        Search = new JButton("Search");

        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = fname.getText();
                String b = fauthor.getText();


                BufferedWriter bw = null;

                try{
                    File myFile = new File("E:/textfile.txt");

                    if (!myFile.exists()) {
                        myFile.createNewFile();
                    }

                    Writer writer = new FileWriter(myFile,true);
                    bw = new BufferedWriter(writer);
                    bw.write(a+" "+b);


                }
                catch (IOException e1){System.out.println(e1);}
                finally {
                    try{
                        bw.close();
                    }
                    catch (IOException e2){System.out.println(e2);}
                    action.setText("Entered");
                }

            }
        });

        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File myFile = new File("E:/textfile.txt");
                try{
                    Scanner sc = new Scanner(myFile);
                    while(sc.hasNextLine()){
                        String check = sc.nextLine();
                        if(check.contains(fname.getText()))
                            action.setText("Found");
                        else
                            action.setText("Not found");
                    }

                }
                catch(FileNotFoundException e1){System.out.println(e1);}


            }
        });

        jfrm.add(name);
        jfrm.add(fname);
        jfrm.add(author);
        jfrm.add(fauthor);
        jfrm.add(Enter);
        jfrm.add(Search);
        jfrm.add(action);

        jfrm.setVisible(true);
    }

    public static void main(String []args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new practice();
            }
        });
    }
}
