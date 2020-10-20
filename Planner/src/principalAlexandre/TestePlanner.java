package principalAlexandre;

import java.util.Scanner;

public class TestePlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Dia segunda = new Dia();
        Dia terça = new Dia();
        Dia quarta = new Dia();
        Dia quinta = new Dia();
        Dia sexta = new Dia();
        
        Dia[] dias = {segunda,terça,quarta,quinta,sexta};
        Semana semana = new Semana(dias);       
        
        String descricaoAux = new String();
        int duracaoAux;
        int diaAux;
        int horarioAux;
        boolean diaViavel;
        boolean duracaoViavel;
        
        System.out.println("Esse é o aplicativo Planner! Digite <exit> na descrição para sair\n");
        
        for(int i = 0; i != 1;){
            diaViavel = true;
            duracaoViavel = true;
            
            System.out.println("Descreva o seu compromisso:");
            descricaoAux = input.nextLine();
            if(descricaoAux.equals("exit")){
                i = 1;
                break;
            }
            
            System.out.println("Digite a duração do compromisso em horas(números):");
            duracaoAux = input.nextInt();
            if(duracaoAux<1 || duracaoAux >10){
                System.out.println("Duração inválida!");
                duracaoViavel = false;
            }
            
            if(duracaoViavel){
                Compromisso compromissoAux = new Compromisso(descricaoAux, duracaoAux);
                System.out.println("Em qual dia você quer marcar? Digite o número do dia. Exemplo: Segunda será o número 2");
                diaAux = input.nextInt();
                
                if(diaAux < 2 || diaAux > 6){
                System.out.println("Dia inválido !!!!");
                diaViavel = false;
                }
                if(diaViavel){
                    System.out.println("Em qual horário você deseja marcar?(Em números): ");
                    horarioAux = input.nextInt();
                    semana.adicionaCompromissoDiaSemana(diaAux, horarioAux, compromissoAux);
                } 
            }
            input.nextLine();
        }
        semana.listaCompromissosSemana();
        
        
    }
    public static void limpaBuffer(Scanner input){
        while(input.hasNext()){
            input.next();
        }
    }
}
