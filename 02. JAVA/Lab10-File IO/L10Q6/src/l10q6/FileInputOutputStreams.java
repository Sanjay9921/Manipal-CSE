package l10q6;

import java.io.*;

public class FileInputOutputStreams{
    FileInputStream fin = null;
    FileOutputStream fout = null;

    public FileInputOutputStreams(String ipPath, String opPath) throws IOException{
        try{
            // fin = new FileInputStream(args[0]);
            // fout = new FileOutputStream(args[1]);
            
            fin = new FileInputStream(ipPath);
            fout = new FileOutputStream(opPath);
            
            int i;
            while((i=fin.read()) != -1){
                fout.write(i);
            }
                    
            System.out.println("File Input Output Streams successfully copied " + ipPath + " to " + opPath);
        }
        finally{
            fin.close();
            fout.close();
        }
    }
}
