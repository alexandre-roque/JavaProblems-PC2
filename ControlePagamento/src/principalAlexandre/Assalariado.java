package principalAlexandre;
public class Assalariado extends Empregado {
    private int horasTrabalhadas;

    public Assalariado(int horasTrabalhadas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Assalariado(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Assalariado() {
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
        double salario = ControlePagamento.SALARIO;
        if(this.getHorasTrabalhadas() > 40){
            salario += (this.getHorasTrabalhadas() - 40) * ControlePagamento.HORA;
        }
        return salario + (salario*0.1);
    }
    
    
    
    
    
}
