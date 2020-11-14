package textFileApps;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;
    // open file clients.txt

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("palavras7letras.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // read record from file
    public static String[] readRecords() {
        String[] palavras = null;
        String linha;
        
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents     
                linha = input.nextLine();
                palavras = linha.split(" ");  
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        return palavras;
    } // end method readRecords

    // close file and terminate application
    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }
} // end class ReadTextFile
