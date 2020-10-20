package principalAlexandre;

import java.util.Calendar;
import java.util.Random;

public class Concessionaria extends Conta {
    private Calendar emissao;
    private Calendar vencimento;

    public Concessionaria(Calendar emissao, Calendar vencimento) {
        this.emissao = emissao;
        this.vencimento = vencimento;
    }

    public Concessionaria() {
    }
    
    public Calendar getEmissao() {
        return emissao;
    }

    public void setEmissao(Calendar emissao) {
        this.emissao = emissao;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public void setVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }    

    private boolean verificavencimento(Calendar emissao, Calendar vencimento){

        boolean data;
        if (this.emissao.before(this.vencimento)){

                data = true;
        }
        else if (this.emissao.after(this.vencimento))
                data = false;
        else
                data = true;

        return data;
    }
    
    @Override
    public double getValorAPagar(){
        Random gerador = new Random();
        double totalContas = 0;
        totalContas = 1000 + gerador.nextInt(100);
        return totalContas;
    }

    
}
