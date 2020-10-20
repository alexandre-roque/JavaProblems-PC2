package principalAlexandre;
public class Compromisso {
    private String descricao;
    private int duracao;

    public Compromisso(String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }
    
    public Compromisso() {
        this.descricao = "";
        this.duracao = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}
