package principalAlexandreRoque_VitorSantana;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Alexandre Roque e Vitor Santana
 */
public class JogoCampoMinado {
    private int numTentativas;
    private int dificuldade;
    private int numBombas;
    private ArrayList<Integer> posicoesBombas = new ArrayList<>();
    private SecureRandom gerador = new SecureRandom();

    public JogoCampoMinado(int numTentativas, int dificuldade) {
        this.numTentativas = numTentativas;
        this.dificuldade = dificuldade;
        this.numBombas = this.dificuldade * 5;
        this.geraBombas();
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public void setNumTentativas(int numTentativas) {
        this.numTentativas = numTentativas;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getNumBombas() {
        return numBombas;
    }

    public void setNumBombas(int numBombas) {
        this.numBombas = numBombas;
    }
    
    public void realizaJogada(){
        this.setNumTentativas(this.getNumTentativas() - 1);
    }

    public ArrayList<Integer> getPosicoesBombas() {
        return posicoesBombas;
    }

    public void setPosicoesBombas(ArrayList<Integer> posicoesBombas) {
        this.posicoesBombas = posicoesBombas;
    }
    
    public void geraBombas() {
        int posicaoBombaAux;
        for (int i = 0; i < this.getNumBombas(); i++) {
            posicaoBombaAux = this.gerador.nextInt(84);
            Integer conversorAux = posicaoBombaAux;

            if (!this.posicoesBombas.contains(posicaoBombaAux)) {
                this.posicoesBombas.add(conversorAux);
            } else {
                i--;
            }
        }
    }
    
}
