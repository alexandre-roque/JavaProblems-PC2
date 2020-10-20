package principalAlexandre;
public abstract class Conta implements Pagavel {
    protected int dia;
    protected int mes;
    protected double valor;   
    
    @Override
    public abstract double getValorAPagar();
}
