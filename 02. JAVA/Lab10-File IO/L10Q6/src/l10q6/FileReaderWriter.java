package l10q6;

import java.io.*;

public class FileReaderWriter{
    FileReader fr = null;
    FileWriter fw = null;
    
    public FileReaderWriter(String ipPath, String opPath) throws IOException{
        try{
            // fr = new FileReader(args[0]);
            // fw = new FileWriter(args[1]);
            
            fr = new FileReader(ipPath);
            fw = new FileWriter(opPath);
            
            int i;
            while((i=fr.read()) != -1){
                fw.write(i);
            }
                    
            System.out.println("File Reader Writer successfully copied " + ipPath + " to " + opPath);
        }
        finally{
            fr.close();
            fw.close();
        }
    }
}
