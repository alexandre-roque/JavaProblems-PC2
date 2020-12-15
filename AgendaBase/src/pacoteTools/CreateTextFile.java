package pacoteTools;
import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class CreateTextFile
{
   private static Formatter output; // outputs text to a file
   // open file clients.txt
   public static void openFile(String nomeArquivo)
   {
      try
      {
         output = new Formatter(nomeArquivo); // open the file
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add records to file
   public static void addRecords()
   {
      Scanner input = new Scanner(System.in);
      System.out.printf("%s %s %s %s", "Nome",
         "Telefone", "Endereço", "Email\n");

      while (input.hasNext()) // loop until end-of-file indicator
      {
         try
         {
            // output new record to file; assumes valid input
            output.format("%s %s %s %n", input.next(), 
               input.next(), input.next(), input.next());                             
         } 
         catch (FormatterClosedException formatterClosedException)
         {
            System.err.println("Error writing to file. Terminating.");
            break;
         } 
         catch (NoSuchElementException elementException)
         {
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } 

         System.out.print("? ");
      }
   }

   // close file
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 
} // end class CreateTextFile
