import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args)  {
        File file = new File("src/main/resources/text.txt");
        Scanner scanner;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                String str = scanner.nextLine().trim();
               // System.out.println(str);
                Splitting.split(str);
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File is empty!");
        }
    }

}
// merge request