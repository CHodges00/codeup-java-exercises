package fileIOpractice;

import com.sun.source.tree.IfTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Environment {

    public static void printPoem(Path filepath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filepath);

        for (int i = 0; i < fileContents.size(); i++) {
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
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
            System.out.println();
            System.out.println("****** CREATED DIRECTORY ******");
        }

//        ^^ CREATE FILE FOR DIRECTORY
        if (Files.notExists(dataDirectoryAndFile)) {
            Files.createFile(dataDirectoryAndFile);
            System.out.println("****** CREATED FILE ******");
        }

//        TODO
//        WRITE TO FILES THAT EXIST
//        MANIPULATE CONTENT IN FILES
        System.out.println();
        System.out.println("=========== WRITING INTO =============");
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

//        TODO
//        SET UP SOMETHING TO WRITE INTO FILE
//        LIST OF STRINGS TO ADD
        System.out.println();
        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Eggs", "Steak", "Pepper", "Salt", "-Cheese-");
        System.out.println("groceryList = " + groceryList);
        System.out.println();

//        TODO
//        WRITE TO FILE
//        OVERWRITES ALL CONTENT EACH TIME ARRAYLIST IS ADDED TO
        Files.write(dataDirectoryAndFile, groceryList);

//        TODO
//        UPDATE FILE
//        APPENDS AS OPPOSED TO OVERWRITING FILE CONTENTS
        List<String> forgotAGrocery = Arrays.asList("Muenster", "Gouda", "Cheddar");
        Files.write(dataDirectoryAndFile, forgotAGrocery, StandardOpenOption.APPEND);


//        TODO
//        READ FILE CONTENTS IN JAVA
//        SET STRINGS TO LIST VARIABLE AND THEN PRINTS CONTENT IN TEXT FILE BY LINE
        List<String> printList = Files.readAllLines(dataDirectoryAndFile);
        System.out.println("printList = " + printList);
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " : " + printList.get(i));
        }

        System.out.println("=================================================");
//        TODO
//        REPLACE ELEMENT WITH NEW ELEMENT
//
//        GET LIST FROM FILE
        List<String> listToUpdate = Files.readAllLines(dataDirectoryAndFile);
//        SET UP SECOND LIST THAT WILL BE SENT/MODIFY CONTENT IN THIS LIST
        List<String> updatedList = new ArrayList<>();

//        LOOP THROUGH LINES TO CHECK FOR INFORMATION TO REPLACE
        for (String line : listToUpdate){
            if (line.equalsIgnoreCase("Muenster")){
                updatedList.add("Parmesan");
                continue;
            }
            updatedList.add(line);
        }

        System.out.println(listToUpdate);
        System.out.println(updatedList);
        System.out.println("=================================================");

//        WRITE CHANGED LIST TO FILE
        Files.write(dataDirectoryAndFile, updatedList);

        List<String> newPrintList = Files.readAllLines(dataDirectoryAndFile);
        System.out.println("newPrintList = " + newPrintList);
        for (int i = 0; i < newPrintList.size(); i++) {
            System.out.println((i + 1) + " : " + newPrintList.get(i));
        }



    }


}
