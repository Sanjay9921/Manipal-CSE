package l10q6;

import java.io.*;
import java.util.Scanner;

public class FileScannerPrintWriter{
    
    File fileSource = null;
    File fileDest = null;
                
    Scanner sc = null;
    PrintWriter pw = null;

    public FileScannerPrintWriter(String ipPath, String opPath) throws IOException, FileNotFoundException{
        try{
            // fileSource = new File(args[0]);
	    // fileDest = new File(args[1]);
            
            fileSource = new File(ipPath);
            fileDest = new File(opPath);
            
            sc = new Scanner(fileSource);
            pw = new PrintWriter(fileDest);

            while(sc.hasNextLine()){
                pw.write(sc.nextLine());
            }
                    
            System.out.println("File Scanner PrintWriter successfully copied " + ipPath + " to " + opPath);
        }
        finally{
            sc.close();
            pw.close();
        }
    }
}
