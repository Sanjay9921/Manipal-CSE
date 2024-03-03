package l10q3;

import java.io.*;

public class L10Q3 {

    public static void displayListing(File[] paths){
        for(File file : paths){
            if(file.isDirectory()){
                System.out.println("> " + file.getName());
                // Recursion
                displayListing(file.listFiles());
            }
            else{
                System.out.println("| " + file.getName());
            }
        }
    }
    public static void main(String[] args) {
        File file = null;
        String currDir = "./";
        try{
            file = new File(currDir);
            File[] paths = file.listFiles();
            displayListing(paths);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
