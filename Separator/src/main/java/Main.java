import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

public class Main {
    public static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args)  {
        Separator separator = new Separator();
        words = separator.readFromFile(words);

        try {
            FilePusher filePusher = new FilePusher();
            filePusher.fillCSV(words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


