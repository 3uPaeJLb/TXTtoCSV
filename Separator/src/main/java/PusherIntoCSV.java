import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class PusherIntoCSV {
    private static final String CSV_PATH = "data.csv";

    public void fillCSV(Map<String, Integer> words) throws IOException {
        File csv = new File("CSV_PATH");
        FileWriter writer = new FileWriter(csv);

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            writer.write(entry.getKey() + ", " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
