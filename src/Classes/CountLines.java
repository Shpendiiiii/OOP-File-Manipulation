package Classes;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CountLines {
    private String input;
    private String output;

    public CountLines(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String countLines(String stringToLookUp) {
        try {

            File file = new File(input);
            Scanner scanner = new Scanner(file);

            File outputFile = new File(output);

            FileWriter myWriter = new FileWriter(outputFile);

            int count = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(stringToLookUp)) {
                    count += 1;
                    System.out.println("Found desired string in line: " + line);

                    myWriter.write("Found desired string in line: " + line + "\n");

                }
            }

            System.out.println("Found your word: " + stringToLookUp + ", " + count + " times");
            myWriter.write("\n\n" + "Found your word: " + stringToLookUp + ", " + count + " times");

            myWriter.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return stringToLookUp;

    }

}
