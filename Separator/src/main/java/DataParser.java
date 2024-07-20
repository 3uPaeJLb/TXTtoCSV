import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataParser {
    private static final String FILE_PATH = "src/main/resources/text.txt";
    private Map<String, Integer> wordsMap = new HashMap<>();
    private DataWriter dataWriter;

    public DataParser()
    {
        dataWriter = new DataWriter();
    }

    public void readFromFile()
    {
        File file = new File(FILE_PATH);

        Scanner scanner;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();

                separate(str);
            }

            dataWriter.fillCSV(wordsMap);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void separate(String str) {
        String[] words;
        words = str.split(" ");

        boolean found;
        for (String word : words)
        {
            found = wordsMap.containsKey(word);

            if (found)
            {
                int value = wordsMap.get(word);
                wordsMap.put(word, value + 1);
            }
            else
                wordsMap.put(word, 1);
        }

    }
}
