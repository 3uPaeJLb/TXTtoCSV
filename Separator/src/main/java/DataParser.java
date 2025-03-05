import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataParser {
    //private static final String FILE_PATH = "C:/Users/marti/Desktop/TXTtoCSV/Separator/src/main/resources/text.txt";
    public Map<String, Integer> wordsMap = new HashMap<>();

    public void readFromFile(String inputFile)
    {
        File file = new File(inputFile);

        Scanner scanner;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();

                separate(str);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void separate(String str) {
        String[] words;
        words = str.split("[^a-zA-Z0-9]+");

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
