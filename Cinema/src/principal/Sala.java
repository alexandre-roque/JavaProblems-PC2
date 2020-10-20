package principal;

import java.util.HashMap;
import java.util.Set;

public class Sala {
    private int numero;
    private int capacidade;
    private int quantidadeAtual;
    private static int identificador = 1;
    
    private HashMap<Integer , Ingresso> assentos = new HashMap();

    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.quantidadeAtual = 0;
    }
    public Sala() {
        this.numero = 0;
        this.capacidade = 0;
        this.quantidadeAtual = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public HashMap<Integer, Ingresso> getAssentos() {
        return assentos;
    }

    public void setAssentos(HashMap<Integer, Ingresso> assentos) {
        this.assentos = assentos;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
    
    public void ocupaAssento(Ingresso ingresso){
        this.getAssentos().put(identificador , ingresso);
        this.setQuantidadeAtual(this.getQuantidadeAtual() + 1);
        identificador++;
    }
    
    public void exibeAssentosOcupados(){
        Set<Integer> chaves = this.getAssentos().keySet();
        for(int chave: chaves){
            System.out.println(chave);
        }
    }
}
