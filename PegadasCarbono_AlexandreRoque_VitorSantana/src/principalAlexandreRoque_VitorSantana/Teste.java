package principalAlexandreRoque_VitorSantana;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        /*Parâmetros:
        Predio(String nomeEdificio, String descricaoEdificio, double qntdBotijaoGas, double energiaEletricaConsumidaMes)
        Carro(String modelo, double cilindradaMotor, double distanciaPercorridaPorDia, int qtdPessoasCarro)
        Bicicleta(String modelo, double qtdQuiloBorracha, double qtdQuiloMetal)*/  
        
        PegadaDeCarbono predio = new Predio("Guimarões Dias", "Residencial", 32, 40000);
        PegadaDeCarbono carro = new Carro("Onix", 1.2 , 32, 4);
        PegadaDeCarbono bicicleta = new Bicicleta("Fixed Gear", 1.5, 1);
        PegadaDeCarbono bicicleta2 = new Bicicleta("Moutain Bike", 1.2, 1);
        PegadaDeCarbono carro2 = new Carro("Corolla", 1.6 , 50, 1);
        PegadaDeCarbono predio2 = new Predio("Maria Delgada", "Residencial", 12, 3400);
        
        ArrayList<PegadaDeCarbono> pegadaDeCarbono = new ArrayList<>();
        
        pegadaDeCarbono.add(predio);
        pegadaDeCarbono.add(carro);
        pegadaDeCarbono.add(bicicleta);
        pegadaDeCarbono.add(bicicleta2);
        pegadaDeCarbono.add(carro2);
        pegadaDeCarbono.add(predio2);
        
        for(PegadaDeCarbono pegada : pegadaDeCarbono){
            if(pegada instanceof Predio){
                System.out.println("Predio: "+((Predio) pegada).getNomeEdificio()+"\nDestinado: "+ ((Predio) pegada).getDescricaoEdificio());   
            }
            if(pegada instanceof Carro){
                System.out.println("Carro: "+ ((Carro) pegada).getModelo());
            }
            if(pegada instanceof Bicicleta){
                System.out.println("Bicicleta: "+ ((Bicicleta) pegada).getModelo());
            }
            
            
            System.out.println("Quantidade de CO2-eq: "+pegada.getPegadaDeCarbono());
            System.out.println("");
        }
    }
}
