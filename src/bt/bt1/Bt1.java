package bt.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bt1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/outPut.txt");
        int n;
        StringBuilder s = new StringBuilder();
        while ((n = fileReader.read()) != -1) {
            s.append((char) n);
        }
        List<String> stringList = new ArrayList<>(List.of(s.toString().split(" ")));
        int count = 0;
        for (String a: stringList) {
            if (!a.isEmpty()){
                count += 1;
            }
        }
        System.out.printf("Chuỗi từ file có %d kí tự\n", count);
    }
}