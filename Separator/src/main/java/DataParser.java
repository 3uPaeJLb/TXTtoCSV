import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataParser {
    
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

        String[] words = str.split("[^a-zA-Z0-9]+");

        for (String word : words) {

            word = word.trim();

            if (!word.isEmpty()) {

                wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
            }
        }
    }
}
