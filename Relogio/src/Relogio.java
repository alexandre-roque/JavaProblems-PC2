
import java.util.Set;

public class Relogio {
    private Contador hora;
    private Contador minuto;
    private boolean formato;

    public Relogio(Contador hora, Contador minuto, boolean formato) {
        this.hora = hora;
        this.minuto = minuto;
        this.formato = formato;
    }

    public Relogio(){}
    
    public Contador getHora() {
        return hora;
    }
    public void setHora(Contador hora) {
        this.hora = hora;
    }
    public Contador getMinuto() {
        return minuto;
    }
    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }
    public boolean getFormato() {
        return formato;
    }
    public void setFormato(boolean formato) {
        this.formato = formato;
    }
    
    public void ticTac(){
        minuto.incrementar();
        if(minuto.getValor() == 0){
            hora.incrementar();
        }        
    }
    
    public void mostrarHora(){
        
        if(formato==true){
            if(hora.getValor()<10 && minuto.getValor()<10){
                System.out.println("0"+hora.getValor()+":0"+minuto.getValor());
            }
            if(hora.getValor()<10 && minuto.getValor()>=10){
                System.out.println("0"+hora.getValor()+":"+minuto.getValor());
            }
            if(hora.getValor()>=10 && minuto.getValor()<10){
                System.out.println(hora.getValor()+":0"+minuto.getValor());
            }
            if(hora.getValor()>=10 && minuto.getValor()>=10){
                System.out.println(hora.getValor()+":"+minuto.getValor());
            }
        }
        if(formato==false){
            if(hora.getValor()<10 && minuto.getValor()<10){
                System.out.println("0"+hora.getValor()+":0"+minuto.getValor()+" A.M");
            }
            if(hora.getValor()<10 && minuto.getValor()>=10){
                System.out.println("0"+hora.getValor()+":"+minuto.getValor()+" A.M");
            }
            if((hora.getValor()>=10 && hora.getValor()<12) && minuto.getValor()<10){
                System.out.println(hora.getValor()+":0"+minuto.getValor()+" A.M");
            }
            if((hora.getValor()>=10 && hora.getValor()<12) && minuto.getValor()>=10){
                System.out.println(hora.getValor()+":"+minuto.getValor()+" A.M");
            }
            
            if((hora.getValor()>=12 && hora.getValor()<22) && minuto.getValor()<10){
                System.out.println("0"+hora.getValor()%12+":0"+minuto.getValor()+" P.M");
            }
            if((hora.getValor()>=12 && hora.getValor()<22) && minuto.getValor()>10){
                System.out.println("0"+hora.getValor()%12+":"+minuto.getValor()+" P.M");
            }
            if((hora.getValor()>12 && hora.getValor()>=22) && minuto.getValor()<10){
                System.out.println(hora.getValor()%12+":0"+minuto.getValor()+" P.M");
            }
            if((hora.getValor()>12 && hora.getValor()>=22) && minuto.getValor()>10){
                System.out.println(hora.getValor()%12+":"+minuto.getValor()+" P.M");
            }
        }
    }
    
}
