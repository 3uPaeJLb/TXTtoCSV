import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int length = args.length;
        if (args.length < 2) {
            System.out.println("usage: java Main <input_file> <output_file>");
            return;
        }
        String inputFile = args[0];
        String outputFile = args[1];
        DataParser dataParser = new DataParser();
        DataWriter dataWriter = new DataWriter();
        dataParser.readFromFile(inputFile);
        dataWriter.fillCSV(dataParser.wordsMap, outputFile);
    }
}


