package l10q2;

import java.io.*;

class ReadDir{
    
    File f = null;
    String[] paths;
    
    public void listContents(String currDir){
        try{
            f = new File(currDir);
            paths = f.list();

            for(String path : paths){
                System.out.println(path);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class L10Q2 {
    public static void main(String[] args) {
        ReadDir rd = new ReadDir();
        rd.listContents("./");
    }   
}
