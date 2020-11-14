package dominio;

import java.util.Random;

/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class Missao {
    private String nome;
    private String descricao;
    private String rank;
    private Random gerador = new Random();

    public Missao(String nome, String descricao, String rank) {
        this.nome = nome;
        this.descricao = descricao;
        this.rank = rank;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double calculaMerito(){
        double merito = 0;
        
        
        if(this.rank.equals("S")){
            merito = 100000*(this.gerador.nextInt(10)+1);
        }
        if(this.rank.equals("A")){
            merito = 10000*(this.gerador.nextInt(10)+1);
        }
        if(this.rank.equals("B")){
            merito = 1000*(this.gerador.nextInt(10)+1);
        }
        if(this.rank.equals("C")){
            merito = 100*(this.gerador.nextInt(10)+1);
        }
        if(this.rank.equals("D")){
            merito = 10*(this.gerador.nextInt(10)+1);
        }
        
        return merito;
    }
    
}
