import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SepAndFill {
    public static HashMap<String, Integer> readFromFile(File file, HashMap<String, Integer> words)
    {
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

    public static void separate(String str, HashMap<String, Integer> words) {
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
    public static void fillCSV(HashMap<String, Integer> words) throws IOException {
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
