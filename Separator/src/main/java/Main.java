import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DataWriter {

    public void fillCSV(Map<String, Integer> words, String outputFile) throws IOException {
        File csv = new File(outputFile);
        FileWriter writer = new FileWriter(csv);
        Map<String, Integer> sortedWords = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(words.entrySet());

        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedList) {
            sortedWords.put(entry.getKey(), entry.getValue());
        }
        double count = sortedWords.size();
        System.out.println(count);
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            writer.write(entry.getKey() + ", " + entry.getValue() + ", " + ((double)entry.getValue()/count * 100) + "% "+ "\n");
        }

        writer.close();
    }
}
