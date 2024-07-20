import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args)  {
        Separator separator = new Separator();
        separator.readFromFile();
    }
}


