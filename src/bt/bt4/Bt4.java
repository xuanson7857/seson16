package bt.bt4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bt4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/outPut.txt");
        int n;
        StringBuilder s = new StringBuilder();
        while ((n = fileReader.read()) != -1) {
            s.append((char) n);
        }
        List<String> lines = new ArrayList<>(List.of(s.toString().split(" ")));
        lines.sort(Comparator.comparingInt(s2 -> (int) s2.charAt(0)));
        lines.forEach(line -> System.out.print(line + " "));
    }
}
