package Classes;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class LongestLineLetter {
    private String input;
    private String output;

    public LongestLineLetter(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public void searchForLetter(String character) {
        //used the string data type, because it has the .toUpperCase() and .toLowerCase() methods, while char
        //does not
        int lineNo = 0;
        int longestLine = 0;
        int length = 0;
        try {
            File file = new File(input);

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                lineNo++;
                String line = scan.nextLine();
                if(line.contains(character.toUpperCase()) || line.contains(character.toLowerCase())){
                   if(line.length() > length){
                       length = line.length();
                       longestLine = lineNo;
                   }
                }
            }
            scan.close();

            String info = "Filename: " + input + "\nLetter: " + character + "\nLongest line: " + longestLine + "\nLength: " + length;

            FileWriter writer = new FileWriter("Texts/Outputs/" + output);
            writer.write(info);
            writer.close();

            System.out.println(info);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
