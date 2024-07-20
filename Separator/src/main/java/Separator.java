import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Separator {
    final String filePath = "src/main/resources/text.txt";

    public Map<String, Integer> readFromFile(Map<String, Integer> words)
    {
        File file = new File(filePath);
        Scanner scanner;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();

                separate(str, words);
            }
        } catch (IOException e) {
            System.out.println("File is empty!");
        }
        return words;
    }

    private void separate(String str, Map<String, Integer> words) {
        String[] strings;
        strings = str.split(" ");

        if (words.size() != 0) {
            boolean found;
            for (int i = 0; i < strings.length; i++)
            {
                found = words.containsKey(strings[i]);

                if (found)
                {
                    int value = words.get(strings[i]);
                    words.put(strings[i], value + 1);
                }
                else
                    words.put(strings[i], 1);
            }
        }
        else
        {
            for (int i = 0; i < strings.length; i++)
            {
                words.put(strings[i], 1);
            }
        }
    }
}
