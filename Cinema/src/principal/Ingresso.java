package principal;
public class Ingresso {
    private double valor;
    private Filme filme;

    public Ingresso(Filme filme) {
        this.filme = filme;
        
        if(this.filme.getDimensao().equals("3d"))
            this.valor = 30;
        else
            this.valor = 20;
    }

    public Ingresso() {
        this.valor = 0;
        this.filme = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    
}
