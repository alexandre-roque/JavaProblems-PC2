package principalAlexandreRoque_VitorSantana;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteUber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Veiculo uber1 = new Veiculo("Onix", 5, "001");
        Motorista motoristaUber1 = new Motorista("Ricardo", "4 estrelas", uber1);
        
        Veiculo uber2 = new Veiculo("Corolla", 5, "002");
        Motorista motoristaUber2 = new Motorista("Matheus", "5 estrelas", uber2);
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        veiculos.add(uber1);
        veiculos.add(uber2);
        
        String verificador = new String();
        int numeroPassageiros; 
        String nomePassageiro;
        String auxCodigo;
        String auxDestino;
        
        System.out.println("Bem-vindo ao aplicativo Cefet-Uber!");
        
        do{
            System.out.println("Carros disponiveís: ");
            
            for(Veiculo veiculo : veiculos){
                veiculo.listaDetalhes();
            }
            
            System.out.println("Qual você irá escolher? Digite seu código");
            auxCodigo = input.next();
            
            for(Veiculo veiculo : veiculos){
                if(auxCodigo.equals(veiculo.getCodigo())){
                    
                    System.out.println("O veiculo escolhido foi: "+veiculo.getModelo());
                    
                    System.out.println("Quantos são os passageiros? ");
                    numeroPassageiros = input.nextInt();

                    for(int i = 0; i < numeroPassageiros; i++){
                        System.out.println("Qual o nome do passageiro? ");
                        nomePassageiro = input.next();
                        Passageiro passageiro = new Passageiro(nomePassageiro);
                        veiculo.adicionaPassageiro(passageiro);
                    }
                    System.out.println("Qual o destino? ");
                    auxDestino = input.next();
                    veiculo.fazerCorrida(auxDestino);
                    veiculo.finalizaCorrida();
                }
                
            }
            System.out.println("Vamos para a próxima corrida ou digite <exit> para sair");
            verificador = input.next();
            
        }while(!(verificador.equals("exit")));
        
        for(Veiculo veiculo : veiculos){
            if(veiculo != null){
                System.out.println(veiculo.getModelo());
                System.out.println("Lucro Total: "+veiculo.getValorTotal());
                System.out.println("Lucro Motorista: "+veiculo.calculaGanhoMotorista());
                System.out.println("Lucro Administração: "+veiculo.calculaGanhoAdministracao());  
            }
        }
        
        
        
        
        
    }
}
