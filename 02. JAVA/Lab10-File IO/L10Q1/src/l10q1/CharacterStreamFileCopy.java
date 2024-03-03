package l10q1;

import java.io.*;

public class CharacterStreamFileCopy {
    
    FileReader fr = null;
    FileWriter fw = null;
    
    public void copyFile(String inputPath, String outputPath) throws IOException{
        try{
            fr = new FileReader(inputPath);
            fw = new FileWriter(outputPath);
            int c;
            while((c = fr.read())!=-1){
                fw.write(c);
            }
            
            System.out.println("File successfully copied!");
        }
        finally{
            if(fr!=null){
                fw.close();
            }
        }
        
        if(fw!=null){
            fw.close();
        }
    }
}
