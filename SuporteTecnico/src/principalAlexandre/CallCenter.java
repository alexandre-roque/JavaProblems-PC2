package principalAlexandre;

import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora(suporte);
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Bem-vindo ao sistema de Suporte Técnico!\nPressione <enter> para continuar ou digite 'sair' para sair do sistema.\n");
        for(int i = 0;i!=1;){
            
            System.out.println("Digite seu problema");
            String problema = new String(input.nextLine());
            
            if(problema.equals("sair")){
                i = 1;
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            }
            
            System.out.println(interpretadora.interpreta(problema)+"\n");
            
        }
    }    
}
