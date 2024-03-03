package l10q6;

import java.io.*;

public class InputOutputStreams{
    
    File fileSource = null;
    File fileDest = null;
                
    InputStream in = null;
    OutputStream out = null;

    public InputOutputStreams(String ipPath, String opPath) throws IOException{
        try{
            // fileSource = new File(args[0]);
	    // fileDest = new File(args[1]);
            
            fileSource = new File(ipPath);
            fileDest = new File(opPath);
            
            in = new FileInputStream(fileSource);
            out = new FileOutputStream(fileDest);
            
            byte[] buffer = new byte[1024];
            int length;

            while((length = in.read(buffer)) > 0){
                out.write(buffer, 0, length);
            }
                    
            System.out.println("Input Output Streams successfully copied " + ipPath + " to " + opPath);
        }
        finally{
            in.close();
            out.close();
        }
    }
}
