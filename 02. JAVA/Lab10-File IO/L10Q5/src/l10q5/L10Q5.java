package l10q5;

import java.io.*;
import java.util.*;

class FileSearch{
    File f;
    String result;
    int occurences;
    
    public FileSearch(String filePath, String searchItem) throws IOException{
        f = new File(filePath);
        this.result = "";
        this.occurences=0;
        Scanner fileScanner = new Scanner(f);
        
        try{
            int lineNumber=0;
            while(fileScanner.hasNextLine()){
                lineNumber++;
                String str = fileScanner.nextLine();
                if(str.contains(searchItem)){
                    occurences++;
                    result += lineNumber + ". " + str + "\n";
                }
            }
        }
        finally{
            fileScanner.close();
        }
        
        if(occurences==0){
           result = searchItem + " not found in this file!\n";
        }
        else{
            result =  searchItem + " has been found on " + occurences + " line" + (occurences==1 ? ":" : "s:") + "\n" + result;
        }
    }

    public String getResult() {
        return result;
    }

    public int getOccurences() {
        return occurences;
    }
}

public class L10Q5 {
    public static void main(String[] args) throws IOException{
        FileSearch fs = new FileSearch("./src/Files/fileNames.txt", "Ryan");
        System.out.println(fs.getResult());
    }
    
}
