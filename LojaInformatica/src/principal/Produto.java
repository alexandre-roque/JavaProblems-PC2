package principal;
public class Produto {
    private String descricao;
    private double valor;
    private int codigo;
    
    public Produto(String descricao, double valor, int codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }
    public Produto(){
        this.descricao = "";
        this.valor = 0;
        this.codigo = 0;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
