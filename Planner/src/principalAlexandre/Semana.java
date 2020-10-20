package principalAlexandre;
public class Semana {
    private Dia[] diasSemana;
    private String[] nomesDiasSemana = {"Segunda-Feira" , "Terça-Feira" , "Quarta-Feira" , "Quinta-Feira" , "Sexta-Feira" };
    
    public Semana(Dia[] diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Dia[] getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(Dia[] diasSemana) {
        this.diasSemana = diasSemana;
    }
    
    public void adicionaCompromissoDiaSemana(int dia, int horario, Compromisso compromisso){
        dia = dia-2;
        this.getDiasSemana()[dia].adicionaCompromisso(compromisso, horario);
 
    }
    
    public void listaCompromissosSemana(){
        System.out.println("Para essa semana temos:");
        for(int i =0; i < diasSemana.length; i++){
            System.out.println(nomesDiasSemana[i]+":");
            diasSemana[i].listaCompromissosDia();
        }
    }
    
}
