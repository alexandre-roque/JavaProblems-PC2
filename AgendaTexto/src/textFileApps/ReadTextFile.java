package textFileApps;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import principal.Contato;

public class ReadTextFile {

    private static Scanner input;
    // open file clients.txt

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("agendaPessoal.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // read record from file
    public static HashMap<String, Contato> readRecords() {
        HashMap<String, Contato> hashMapAux = new HashMap<>();
        
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents     
                String linha = input.nextLine();
                String[] pedacosLinha = linha.split(";");
                
                String nome = "";
                String endereco = "";
                String telefone = "";
                String email = "";
        
                if(pedacosLinha[0]!=null){
                    nome = pedacosLinha[0];
                }
                if(pedacosLinha[0]!=null){
                    endereco = pedacosLinha[1];
                }
                if(pedacosLinha[0]!=null){
                    telefone = pedacosLinha[2];
                }
                if(pedacosLinha[0]!=null){
                    email = pedacosLinha[3];
                }
   
                // System.out.println(nome+" "+endereco+" "+telefone+" "+email);
                Contato c = new Contato(nome, endereco, telefone, email);
                
                hashMapAux.put(c.getTelefone(), c);
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        return hashMapAux;
    } // end method readRecords

    // close file and terminate application
    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }
} // end class ReadTextFile
