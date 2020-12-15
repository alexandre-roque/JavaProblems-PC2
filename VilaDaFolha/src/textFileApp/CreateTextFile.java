package textFileApp;

import dominio.Missao;
import dominio.Ninja;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output; // outputs text to a file
    // open file clients.txt

    public static void openFile(String nomeArquivo) {
        try {
            output = new Formatter(nomeArquivo); // open the file
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // add records to file
    public static void addRecordsNinja(Ninja ninja) {

        try {
            // output new record to file; assumes valid input
            output.format("%s;%n;%s;%d;%s\n", 
                    ninja.getNome(), ninja.getIdade(), ninja.getRank(), ninja.getMerito(), ninja.getImagem());
            
            
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Erro ao escrever no arquivo. Finalizando.");
        } catch (NoSuchElementException elementException) {
            System.err.println("Entrada inválida. Tente novamente!");
        }
    }
    
    public static void addRecordsMissao(Missao missao) {

        try {
            // output new record to file; assumes valid input
            output.format("%s;%n\n", 
                    missao.getDescricao(), missao.getRank());
            
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Erro ao escrever no arquivo. Finalizando.");
        } catch (NoSuchElementException elementException) {
            System.err.println("Entrada inválida. Tente novamente!");
        }
    }
    
    public static void cadastraNinja(Ninja ninja){
        
        try{
             output.format("%s;%s;%s;%s;%s\n",ninja.getNome(), ninja.getRank(),ninja.getIdade(),ninja.getMerito(), ninja.getImagem());
            
        }
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Erro ao escrever no arquivo. Finalizando.");
        } catch (NoSuchElementException elementException) {
            System.err.println("Entrada inválida. Tente novamente!");
        }   
    }
    
    public static void cadastraMissao(Missao missoes) {
        try {
            output.format("%s;%s;%s\n", missoes.getNome(), missoes.getDescricao(), missoes.getRank());

        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Erro ao escrever no arquivo. Finalizando.");
        } catch (NoSuchElementException elementException) {
            System.err.println("Entrada inválida. Tente novamente!");
        }
    }

    // close file
    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
    
} // end class CreateTextFile
