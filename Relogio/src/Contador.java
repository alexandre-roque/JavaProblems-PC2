public class Contador {
    private int valor;
    private double limite;

    public Contador(int valor, double limite) {
        this.valor = valor;
        this.limite = limite;
    }
    
    public Contador(){}
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void incrementar(){
        valor++;
        if(valor == limite){
            valor=0;
        }
        
        
    }
    
}
