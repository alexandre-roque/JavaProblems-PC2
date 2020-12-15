package dominio;


/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class Ninja {
    
    private String nome;
    private int idade;
    private String rank;
    private double merito;
    private String imagem;
    
    public Ninja(String nome, int idade, String rank, double merito, String imagem) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
        this.merito = merito;
        if(imagem.equals("")){
            this.imagem = "/gui/images/ninjaDefault.png"; //321x284
        }
        else
            this.imagem = imagem;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getMerito() {
        return merito;
    }

    public void setMerito(double merito) {
        this.merito = merito;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}
