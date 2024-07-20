import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FilePusher {
    static final File CSV = new File("data.csv");

    public void fillCSV(Map<String, Integer> words) throws IOException {
        FileWriter writer = new FileWriter("CSV");

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            writer.write(entry.getKey() + ", " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
