package l10q1;

import java.io.*;

public class L10Q1 {
    public static void main(String[] args) throws IOException{
        
        // 1. Byte Stream
        ByteStreamFileCopy bsfc1 = new ByteStreamFileCopy();
        bsfc1.copyFile("./src/File_Results/input.txt", "./src/File_Results/output1.txt");
        
        // 2. Character Stream
        CharacterStreamFileCopy csfc1 = new CharacterStreamFileCopy();
        csfc1.copyFile("./src/File_Results/input.txt", "./src/File_Results/output2.txt");
    }
    
}
