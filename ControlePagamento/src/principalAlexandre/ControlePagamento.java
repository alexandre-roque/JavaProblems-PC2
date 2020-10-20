package principalAlexandre;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Pagavel> pagaveis;
    
    public static double SALARIO = 954.00;
    public static double HORA = 8.00;

    public ControlePagamento() {
        this.pagaveis = new ArrayList<Pagavel>();
    }
    
    public ControlePagamento(ArrayList<Pagavel> pagaveis) {
        this.pagaveis = pagaveis;
    }

    public static double getSALARIO() {
        return SALARIO;
    }

    public static void setSALARIO(double SALARIO) {
        ControlePagamento.SALARIO = SALARIO;
    }

    public static double getHORA() {
        return HORA;
    }

    public static void setHORA(double HORA) {
        ControlePagamento.HORA = HORA;
    }

    public ArrayList<Pagavel> getPagaveis() {
        return pagaveis;
    }

    public void setPagaveis(ArrayList<Pagavel> pagaveis) {
        this.pagaveis = pagaveis;
    }

    
}
