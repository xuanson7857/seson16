package bt.bt3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bt3 {

        public static void main(String[] args) {
            String filePath = "path/to/your/file.txt";
            List<String> duplicateWords = timTuTrungLap(filePath);
            System.out.println("Cac tu trung lap trong file:");
            for (String word : duplicateWords) {
                System.out.println(word);
            }
        }

        public static List<String> timTuTrungLap(String filePath) {
            List<String> duplicateWords = new ArrayList<>();
            Map<String, Integer> wordCountMap = new HashMap<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    duplicateWords.add(entry.getKey());
                }
            }
            return duplicateWords;
        }
}
