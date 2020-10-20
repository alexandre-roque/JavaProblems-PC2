package principalAlexandreRoque_VitorSantana;
public class Motorista {
    private String nome;
    private String avaliacao;
    private Veiculo veiculo;
    private double valorRecebido;
    
    
    public Motorista(String nome, String avaliacao, Veiculo veiculo) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.veiculo = veiculo;
        this.valorRecebido = 0;
    }
    
    public Motorista() {
        this.nome = "";
        this.avaliacao = "";
        this.veiculo = null;
        this.valorRecebido = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    
    
}
