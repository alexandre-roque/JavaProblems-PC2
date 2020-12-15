package principalAlexandre;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacoteTools.CreateTextFile;
import pacoteTools.FileAndDirectoryInfo;
import pacoteTools.ReadTextFile;

public class Agenda {
    public static void main(String[] args) {
        
        String nomeArquivo = "agendaPessoal.txt";
        Scanner input = new Scanner(System.in);
        
        HashMap< String, Contato> agenda = new HashMap<>();
        
        try {
            FileAndDirectoryInfo.fileInfo(nomeArquivo);
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //CreateTextFile.openFile(nomeArquivo);
        
        ReadTextFile.openFile();
        
        ReadTextFile.readRecords();
        
        ReadTextFile.closeFile();
        
        
        
        
    }
}
