package pacoteTools;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;
   // open file clients.txt
   public static void openFile()
   {
      try
      {
         input = new Scanner(Paths.get("agendaPessoal.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static void readRecords()
   {
      System.out.printf("%s %s %s %s ", "Nome",
         "Telefone", "Endereço", "Email");

      try 
      {
         while (input.hasNext()) // while there is more to read
         {
            // display record contents                     
            System.out.printf("\n%s %s %s %s", input.next(), 
               input.next(), input.next(), input.next());
         }
      } 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile
