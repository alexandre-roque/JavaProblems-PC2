package Teste;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacoteTools.CreateTextFile;
import pacoteTools.FileAndDirectoryInfo;
public class Teste {
    public static void main(String[] args) {
        String nomeArquivo = "clients.txt";
        CreateTextFile.openFile(nomeArquivo);
        
        try {
            FileAndDirectoryInfo.fileInfo(nomeArquivo);
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
