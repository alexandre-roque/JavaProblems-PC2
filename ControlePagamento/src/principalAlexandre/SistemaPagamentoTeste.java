package principalAlexandre;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 5); 
        c.set(Calendar.MONTH, 10); 
        c.set(Calendar.YEAR, 2020); 
        
        Calendar d = Calendar.getInstance();
        d.set(Calendar.DAY_OF_MONTH, 10); 
        d.set(Calendar.MONTH, 10); 
        d.set(Calendar.YEAR, 2020); 
        
        ControlePagamento controle = new ControlePagamento();
        
        Assalariado assalariado = new Assalariado(42);
        Assalariado assalariado2 = new Assalariado(44,"João", "Paulo",2030);
        AssalariadoComissionado assalariadocomissionado = new AssalariadoComissionado(41, 1000);
        Comissionario comissionario = new Comissionario(15000);
        Terceirizado terceirizado3 = new Terceirizado(44,"Henrique", "Santos", 4002);
        Terceirizado terceirizado = new Terceirizado(44);
        Terceirizado terceirizado2 = new Terceirizado(40);
        
        Pagavel titulo = new Titulo(c,d);
        Concessionaria concessionaria = new Concessionaria();

        controle.getPagaveis().add(assalariado2);
        controle.getPagaveis().add(assalariado);
        controle.getPagaveis().add(assalariadocomissionado);
        controle.getPagaveis().add(comissionario);
        controle.getPagaveis().add(terceirizado2);
        controle.getPagaveis().add(terceirizado3);
        controle.getPagaveis().add(terceirizado);
        
        controle.getPagaveis().add(titulo);
        controle.getPagaveis().add(concessionaria);
        
        System.out.println("Lista de despesas:");
        double valorTotal = 0;
        
        for (Pagavel pagavel: controle.getPagaveis()) {
            
            if(pagavel instanceof Terceirizado){
                if(!((Terceirizado) pagavel).getNome().equals("")){
                    System.out.println("R$: "+pagavel.getValorAPagar()+"- Terceirizado, Nome: "+((Terceirizado) pagavel).getNome()+" "+((Terceirizado) pagavel).getSobrenome());
                }
                else
                    System.out.println("R$: "+pagavel.getValorAPagar()+" - Terceirizado");
            }
            
            if(pagavel instanceof Assalariado){
                if(!((Assalariado) pagavel).getNome().equals("")){
                    System.out.println("R$: "+pagavel.getValorAPagar()+" - Assalariado, Nome: "+((Assalariado) pagavel).getNome()+" "+((Assalariado) pagavel).getSobrenome() );
                }
                else
                    System.out.println("R$: "+pagavel.getValorAPagar()+" - Assalariado"); 
            }
            
            if(pagavel instanceof Comissionario){
                if(!((Comissionario) pagavel).getNome().equals("")){
                    System.out.println("R$: "+pagavel.getValorAPagar()+"- Comissionario/AssalariadoComissionado, Nome: "+((Comissionario) pagavel).getNome()+" "+((Comissionario) pagavel).getSobrenome());
                }
                else
                    System.out.println("R$: "+pagavel.getValorAPagar()+" - Comissionario/AssalariadoComissionado");              
            }
            
            if(pagavel instanceof Titulo){
                System.out.println("R$: "+pagavel.getValorAPagar()+" - Titulo");  
            }
            
            if(pagavel instanceof Concessionaria){
                System.out.println("R$: "+pagavel.getValorAPagar()+" - Concessionaria");  
            }

            valorTotal += pagavel.getValorAPagar();
        }
        
        System.out.println("O valor total da semana é R$: "+valorTotal);
    }  
}
