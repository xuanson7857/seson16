package firewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File outPutFile = new File("src/outPut.txt");
        outPutFile.createNewFile();
        FileWriter writer = new FileWriter(outPutFile);
        BufferedWriter bwriter = new BufferedWriter(writer);
        bwriter.write("Hello");
        bwriter.close();
    }
}
