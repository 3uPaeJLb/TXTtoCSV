import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FilePusher {
    public static void fillCSV(Map<String, Integer> words) throws IOException {
        FileWriter writer = new FileWriter("data.csv");
        String key;
        int value;
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();

            writer.write(key + ", " + value + "\n");
        }
        writer.close();
    }
}
