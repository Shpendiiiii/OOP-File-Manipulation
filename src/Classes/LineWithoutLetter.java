package Classes;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LineWithoutLetter {
    private String input;

    public LineWithoutLetter(String input) {
        this.input = input;
    }

    public String longestNonLetterLine(String letter) {
        int length = 0;
        int lineNo = 0;
        int actual = 0;
        try {

            File file = new File(input);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                lineNo++;
                if (!line.contains(letter.toUpperCase()) && !line.contains(letter.toLowerCase())) {
                    if (length < line.length()) {
                        length = line.length();
                        actual = lineNo;
                    }

                }
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return "File name : " + input + ", length is: " + length + ", line is: " + actual;
    }
    public void writeToFile(String fileName, String info){
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(info);
            writer.close();

        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

}
