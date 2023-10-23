package bt.bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BT2 {
    public static void main(String[] args) {
        String filePath = "src/outPut.txt";
        int count = demSoDong(filePath);
        System.out.println("So dong trong file: " + count);
    }

    public static int demSoDong(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
