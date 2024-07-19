import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static Map<String, Integer> words = new HashMap<>();
    public static File file = new File("src/main/resources/text.txt");

    public static void main(String[] args)  {
        words = SepAndFill.readFromFile(file, words);

        try {
            SepAndFill.fillCSV(words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


