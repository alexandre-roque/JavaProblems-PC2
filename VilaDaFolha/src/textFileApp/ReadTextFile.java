package textFileApp;

import dominio.Missao;
import dominio.Ninja;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;
    // open file clients.txt

    public static void openFile(String nomeArquivo) {
        try {
            input = new Scanner(Paths.get(nomeArquivo));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // read record from file
    public static ArrayList<Ninja> readRecordsNinjas() {
        ArrayList<Ninja> ninjas = new ArrayList<>();
        
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents     
                String linha = input.nextLine();
                String[] pedacosLinha = linha.split(";");
                
                String nome;
                String idade;
                String rank;
                String merito;
                String imagem = "";

                int idadeAux;
                double meritoAux;
                
                if(pedacosLinha[0]!=null){
                    nome = pedacosLinha[0];
                    rank = pedacosLinha[1];
                    idade = pedacosLinha[2];
                    merito = pedacosLinha[3];
                    imagem = pedacosLinha[4];

                    idadeAux = Integer.parseInt(idade);
                    meritoAux = Double.parseDouble(merito);
                    
                    Ninja n = new Ninja(nome, idadeAux, rank, meritoAux, imagem);
                    
                    ninjas.add(n);
                    
                    //System.out.println(nome+" "+rank+" "+idade+" "+merito);
                }
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        return ninjas;
    } // end method readRecords
    
    // read record from file
    public static ArrayList<Missao> readRecordsMissoes() {
        ArrayList<Missao> missoes = new ArrayList<>();
        
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents     
                String linha = input.nextLine();
                String[] pedacosLinha = linha.split(";");
                
                String nome;
                String descricao;
                String rank;

                
                if(pedacosLinha[0]!=null){
                    nome = pedacosLinha[0];
                    descricao = pedacosLinha[1];
                    rank = pedacosLinha[2];
                    
                    Missao m = new Missao(nome, descricao, rank);
                    
                    missoes.add(m);
                    
                    //System.out.println(descricao+" "+rank);
                }
               
                
                
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        return missoes;
    } // end method readRecords

    // close file and terminate application
    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }
} // end class ReadTextFile
