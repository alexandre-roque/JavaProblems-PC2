package principalAlexandre;
public class Terceirizado extends Empregado {
    private int horasTrabalhadas;

    public Terceirizado(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Terceirizado(int horasTrabalhadas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Terceirizado() {
        this.horasTrabalhadas = 0;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
    @Override
    public double getValorAPagar(){
        double salario = (ControlePagamento.HORA * this.getHorasTrabalhadas());
        
        return salario;
    }
    
    
    
    
    
}
