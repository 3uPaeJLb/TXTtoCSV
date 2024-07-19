import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

public class Main {

    public static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args)  {
        words = Separator.readFromFile(words);

        try {
            FilePusher.fillCSV(words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


