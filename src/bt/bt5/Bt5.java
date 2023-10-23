package bt.bt5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bt5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/outPut.txt");
        int n;
        StringBuilder s = new StringBuilder();
        while ((n = fileReader.read()) != -1) {
            s.append((char) n);
        }
        List<String> lines = new ArrayList<>(List.of(s.toString().split(" ")));
        int max = 0;
        for (String str:lines ) {
            for (String str2:lines ) {
                if (str2.length() > max){
                    max = str2.length();
                }
            }
            if (str.length() == max){
                System.out.println(str);
            }
        }
    }
}
