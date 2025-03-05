import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int length = args.length;
        System.out.println(length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        String inputFile = args[0];
        String outputFile = args[1];
        DataParser dataParser = new DataParser();
        DataWriter dataWriter = new DataWriter();
        dataParser.readFromFile(inputFile);
        dataWriter.fillCSV(dataParser.wordsMap, outputFile);
    }
}

