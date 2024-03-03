package l10q6;

import java.io.*;

public class L10Q6 {
    public static void main(String[] args) throws IOException{
        FileReaderWriter copy1 = new FileReaderWriter("./src/Files/inputFile.txt", "./src/Files/outputFile1.txt");
        FileInputOutputStreams copy2 = new FileInputOutputStreams("./src/Files/inputFile.txt", "./src/Files/outputFile2.txt");
        InputOutputStreams copy3 = new InputOutputStreams("./src/Files/inputFile.txt", "./src/Files/outputFile3.txt");
        FileScannerPrintWriter copy4 = new FileScannerPrintWriter("./src/Files/inputFile.txt", "./src/Files/outputFile3.txt");
    }
}
