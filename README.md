# File Manipulation with OOP

## Classes Explanation

### LineWithoutLetter:
This code is a Java class that defines the LineWithoutLetter class. The class has a constructor that takes in a string input, and two methods: longestNonLetterLine() and writeToFile().

The longestNonLetterLine() method takes in a string argument letter and returns the length and line number of the longest line in a file specified by the input string that does not contain either an uppercase or lowercase version of the letter. If there's an error, it prints an error message.

The writeToFile() method takes in a fileName and an info string argument, and writes the info string to the file specified by fileName. If there's an error, it prints an error message.

In the main method, you can write to a text file the output of the objects of this class. 
Use the `writeFile()` method and pass in your wanted text file name and pass in
the `objectName.longestNonLetterLine("B")` where **B** is your chosen letter.

As such: 

if you are using Ubuntu replace the double backslashes with a single slash
```java
LineWithoutLetter test = new LineWithoutLetter("Texts\\anotherExample.txt");

test.writeToFile("Texts\\ouput.txt", test.longestNonLetterLine("B"));
```

### CountLines:
This code defines a Java class CountLines that has two instance variables input and output, and two methods: a constructor and the countLines() method.

The constructor CountLines(String input, String output) takes in two string arguments input and output and sets the class' input and output instance variables to these values.

The countLines() method takes in a string argument stringToLookUp and does the following:

It opens the file specified by the input string and creates a Scanner object to read the file.
It opens a file specified by the output string and creates a FileWriter object to write to the file.
It uses a while loop to iterate through each line of the input file and checks if the line contains the stringToLookUp string.
If the line contains the stringToLookUp string, it increments the count, prints a message indicating the line, and writes the message to the output file.
After the loop, it prints and writes to the output file the final count of how many times the stringToLookUp string was found.
If there's an error reading the input file, it prints an error message.
The method returns the stringToLookUp argument.

To use this class, please: 
* Instantiate an object of the class CountLines:
```java
ountLines test = new CountLines("Texts\\input.txt", "Texts\\Outputs\\myfile.txt");
```
* Use the countLines method where you pass the word you want to lookup
```java
test.countLines("woman");
```

The results will appear in the terminal

## Expertise
The code shows expertise in:
1. Java programming: The code is written in the Java programming language and demonstrates a strong understanding of its syntax and structure.
2. File handling: The code shows expertise in reading from and writing to files, which is accomplished using the Scanner and FileWriter classes in Java.
3. String manipulations: The code performs operations such as searching for a string within a line, concatenating strings, and converting strings to uppercase/lowercase.
4. Basic algorithm design: The code implements a basic algorithm to count the number of occurrences of a string in a text file, which requires a loop to iterate through each line of the file, and a condition to check if the line contains the desired string.


## Trouble running the code?
### Do not hesitate to contact me: **shpendaliu@pm.me**
