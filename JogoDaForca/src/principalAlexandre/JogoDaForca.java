package principalAlexandre;

import java.security.SecureRandom;
import java.util.ArrayList;
import textFileApps.ReadTextFile;

public class JogoDaForca {
    private String[] palavras;
    private int numJogadas;
    private String palavra;
    private SecureRandom gerador = new SecureRandom();
    private boolean vitoria;

    public JogoDaForca(int numJogadas) {
        this.numJogadas = numJogadas;
        recebePalavras();
        sorteaPalavra();
    }
    
    private void recebePalavras(){
        ReadTextFile.openFile();
        this.palavras = ReadTextFile.readRecords();
        ReadTextFile.closeFile();
    }
    
    public void sorteaPalavra(){
        palavra = palavras[gerador.nextInt(palavras.length)];
        System.out.println(palavra);
    }
    
    public void realizaJogada(){
        this.numJogadas--;
    }
    
    public ArrayList<Integer> consultaLetra(String letra){
        realizaJogada();
        ArrayList<Integer> consulta = new ArrayList<>();
        if(this.palavra.contains(letra)){
            for(int i = 0; i < palavra.length() ; i++){
                if(letra.charAt(0) == palavra.charAt(i)){
                    consulta.add(i);
                }
            }
        }
        return consulta;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public int getNumJogadas() {
        return numJogadas;
    }

    public void setNumJogadas(int numJogadas) {
        this.numJogadas = numJogadas;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public boolean isVitoria() {
        return vitoria;
    }

    public void setVitoria(boolean vitoria) {
        this.vitoria = vitoria;
    }
    
    
    
    
    
    
    
}
