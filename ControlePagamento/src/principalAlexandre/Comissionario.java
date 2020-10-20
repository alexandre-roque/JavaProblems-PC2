package principalAlexandre;
public class Comissionario extends Empregado {
    private double totalVendas;

    public Comissionario(double totalVendas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.totalVendas = totalVendas;
    }
    
    public Comissionario(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public Comissionario() {
        this.totalVendas = 0;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double getValorAPagar(){
        double salario = (this.getTotalVendas() * 0.06) ;
        
        return salario + (salario*0.1);
    }
    
    
    
    
    
}
