import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args)  {
        DataParser dataParser = new DataParser();
        dataParser.readFromFile();
    }
}


