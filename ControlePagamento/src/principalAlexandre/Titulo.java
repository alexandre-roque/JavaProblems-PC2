package principalAlexandre;

import java.util.Calendar;

public class Titulo extends Conta {
    private static double titulo = 3000.00;
    private Calendar emissao;
    private Calendar vencimento;

    public Titulo(Calendar emissao, Calendar vencimento) {
        this.emissao = emissao;
        this.vencimento = vencimento;
    }

    public static double getTitulo() {
        return titulo;
    }

    public static void setTitulo(double titulo) {
        Titulo.titulo = titulo;
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
        double valorPagar;
        if(verificavencimento(this.emissao, this.vencimento)){
            valorPagar = titulo + titulo*0.1;
        }
        else
            valorPagar = titulo;
        return valorPagar;

    }
    
    
}

