package principal;
public class Lance {
    private Pessoa pessoa;
    private double valor;

    public Lance(Pessoa pessoa, double valor) {
        this.pessoa = pessoa;
        this.valor = valor;
    }

    public Lance(){}
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
