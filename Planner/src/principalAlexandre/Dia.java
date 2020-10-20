package principalAlexandre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Dia {
    private HashMap<Integer , Compromisso> compromissos;
    private HashSet<Integer> horariosDoDia = new HashSet<>();
    
    public Dia() {
        this.compromissos = new HashMap<>();
        this.adicionaHorarios();
    }

    private void adicionaHorarios(){
        for(int i =9; i<=18; i++){
            this.getHorariosDoDia().add(i);
        }
    }
    
    public HashMap<Integer , Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(HashMap<Integer , Compromisso> compromissos) {
        this.compromissos = compromissos;
    }

    public HashSet<Integer> getHorariosDoDia() {
        return horariosDoDia;
    }

    public void setHorariosDoDia(HashSet<Integer> horariosDoDia) {
        this.horariosDoDia = horariosDoDia;
    }    
    
    public void adicionaCompromisso(Compromisso compromisso, Integer horarioCompromisso){
        int cont = 0;
        for(int i = 0; i <= compromisso.getDuracao() - 1; i++){
            if(this.verificaDisponibilidade(horarioCompromisso + i)){   
                cont++;
            }     
        }
        
        if(cont == compromisso.getDuracao()){
            for(int i = 0; i<= compromisso.getDuracao() - 1; i++){
                this.getHorariosDoDia().remove((horarioCompromisso + i));
                this.getCompromissos().put((horarioCompromisso + i), compromisso);
                
            }     
        }
        else
            System.out.println("Horario Ocupado/Inválido");
        
    }
    
    
    public boolean verificaDisponibilidade(int horario){
        if(this.getHorariosDoDia().contains(horario)){
            return true;
        }
        else 
            return false;
    }
    
    public void listaCompromissosDia(){
        Compromisso aux = new Compromisso();
        for(Integer i = 9; i <= 18 ; i++){
            aux = this.getCompromissos().get(i);
            if(aux != null){
                System.out.println(aux.getDescricao()+" marcado para: "+(i)+":00");
            }
        }
    }
    
}
