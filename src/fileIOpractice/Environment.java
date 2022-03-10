package fileIOpractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Environment {

public static void printPoem(Path filepath) throws IOException{
    System.out.println();
    List<String> fileContents = Files.readAllLines(filepath);

    for (int i = 0; i < fileContents.size(); i ++){
        System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
    }
}

    public static void main(String[] args) throws IOException {
//        Paths class = static method to obtain filepaths (Path class)
//        Path interface = abstracts away differences between Win && MacOS [vs. trying to do everything with strings]

//        Files class - Files.methods() for manipulating / interacting with files ^ utilizing paths above
//        File class object{} representation of a file

//        TODO: Declare and intitialize "Path"
        Path pathToTxt = Paths.get("src/fileIOpractice/Text.txt");

//PRINTS FILE "PATH"
        System.out.println("pathToTxt = " + pathToTxt);

//IF FILE EXISTS
        System.out.println("Files.exists(pathToTxt) = " + Files.exists(pathToTxt));

//PASS FILE TO PRINT METHOD THAT LOOPS THROUGH LINES AND PRINTS FILE INTO CONSOLE
        printPoem(pathToTxt);


//        TODO:
//GET TO EXISTING FILE WITH CLASSES
//CREATE FILE AND DIRECTORY PATH TO FILE

//        STRING REPRESENTING WHAT DIRECTORY
        String directory = "./src/fileIOpractice/data";
//        STRING REPRESENTING FILE NAME
        String fileName = "groceryList.txt";

        System.out.println();
        Path dataDirectory = Paths.get(directory); // Path file passed the directory to go in
        Path dataDirectoryAndFile = Paths.get(directory, fileName);

        System.out.println("dataDirectory = " + dataDirectory);
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

//         IF FILE DOESN'T EXIST, THEN CREATE IT
        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
            System.out.println();
            System.out.println("****** CREATED DIRECTORY ******");
        }

//        ^^ CREATE FILE
        if (Files.notExists(dataDirectoryAndFile)){
            Files.createFile(dataDirectoryAndFile);
            System.out.println("****** CREATED FILE ******");
        }














    }


}
