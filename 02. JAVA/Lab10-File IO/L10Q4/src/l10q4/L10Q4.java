package l10q4;

import java.io.*;

class CustomCount{
    int charCount;
    int lineCount;
    int wordCount;
    int numberCount;
    FileReader fr;
    BufferedReader br;
    
    public CustomCount(String path) throws IOException{
        this.charCount=0;
        this.lineCount=0;
        this.wordCount=0;
        this.numberCount=0;
        
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        String str;
        
        while((str=br.readLine())!=null){
            this.charCount+=str.length();
            
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(c=='.'){ this.lineCount++; }
                
                if(c==' '){ this.wordCount++; }
                
                if(c>=48 && c<=57){ this.numberCount++; } 
            }
        }
    }

    public int getCharCount() {
        return charCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public FileReader getFr() {
        return fr;
    }

    public BufferedReader getBr() {
        return br;
    }
    
}

public class L10Q4 {
    
    public static void main(String[] args) throws IOException{
        CustomCount cc = new CustomCount("./src/Files/fileNames.txt");
        System.out.println("Characters: " + cc.getCharCount());
        System.out.println("Lines: " + cc.getLineCount());
        System.out.println("Words: " + cc.getWordCount());
        System.out.println("Numbers: " + cc.getNumberCount());
    }
    
}
