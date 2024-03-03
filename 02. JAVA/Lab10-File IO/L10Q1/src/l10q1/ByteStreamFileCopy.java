package l10q1;

import java.io.*;

public class ByteStreamFileCopy {
    
    FileInputStream fis = null;
    FileOutputStream fos = null;
    
    public void copyFile(String inputPath, String outputPath) throws IOException{
        try{
            fis = new FileInputStream(inputPath);
            fos = new FileOutputStream(outputPath);
            int c;
            while((c = fis.read())!=-1){
                fos.write(c);
            }
            
            System.out.println("File successfully copied!");
        }
        finally{
            if(fis!=null){
                fis.close();
            }
        }
        
        if(fos!=null){
            fos.close();
        }
    }
}
