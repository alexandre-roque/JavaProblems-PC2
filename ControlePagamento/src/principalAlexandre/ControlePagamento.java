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

    public ArrayList<Pagavel> getPagaveis() {
        return pagaveis;
    }

    public void setPagaveis(ArrayList<Pagavel> pagaveis) {
        this.pagaveis = pagaveis;
    }

    
}
