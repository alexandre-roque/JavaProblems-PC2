package principalAlexandre;
public class AssalariadoComissionado extends Comissionario {
    private int horasTrabalhadas;
    private double totalVendas;

    public AssalariadoComissionado(int horasTrabalhadas, double totalVendas) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.totalVendas = totalVendas;
    }
    
    public AssalariadoComissionado(int horasTrabalhadas, double totalVendas, String nome, String sobrenome, int numIdent) {
        super(totalVendas, nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public AssalariadoComissionado() {
        this.horasTrabalhadas = 0;
        this.totalVendas = 0;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    @Override
    public double getValorAPagar(){
        double salario = ControlePagamento.getSALARIO();
        if(this.getHorasTrabalhadas() > 40){
            salario += (this.getHorasTrabalhadas() - 40) * ControlePagamento.getHORA();
        }
        
        salario += (this.getTotalVendas() * 0.06);
        
        return salario;
    }
    
    
    
    
    
}
