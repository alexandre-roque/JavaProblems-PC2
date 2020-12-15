/*
(10 pontos) Implemente as classes necessárias para o jogo “Papel, Pedra e Tesoura”. 
Dentre as classes, deverá conter uma classe “Elemento” que será a superclasse de Papel, Pedra e Tesoura. 
Além dessa, deverá existir uma classe “Jogo” que ficará jogando até que o usuário informe a opção “Sair”. 
Na classe “Jogo” crie uma variável polimórfica: Elemento e1 para instanciar Papel ou Pedra ou Tesoura. 
Implemente uma escolha aleatória dos objetos e imprima os resultados.
Note que durante os confrontos, o método que realiza a batalha recebe outro objeto do tipo Elemento. 
Neste caso, usando o método específico de cada tipo deverá ser feita uma comparação, sabendo que:

- Papel ganha de Pedra (envolve);
- Pedra ganha de tesoura (quebra);
- Tesoura ganha de Papel (Corta).

Exemplo de saída após um confronto do jogo:

Nessa batalha, Papel enfrenta Pedra
Papel ganha de Pedra (envolve)
Papel vence a batalha!
Pressione <Enter> para jogar novamente ou digite “Sair”...
 */
package principalAlexandreRoque_VitorSantana;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);
        String aux = new String();
        
        int auxElemento1;
        int auxElemento2;
        
        Elemento pedra = new Pedra("Pedra");
        Elemento tesoura = new Tesoura("Tesoura");
        Elemento papel = new Papel("Papel");
        Elemento[] elementos = {pedra,tesoura,papel};
        
        while(!(aux.equals("Sair"))){
            
            auxElemento1 = gerador.nextInt(3);
            auxElemento2 = gerador.nextInt(3);
            
            System.out.println("Jogador 1: "+elementos[auxElemento1].getNomeElemento());
            System.out.println("Jogador 2: "+elementos[auxElemento2].getNomeElemento());
            
            elementos[auxElemento1].compara(elementos[auxElemento2]);
            
            System.out.println("\nDigite qualquer caractere para continuar jogando ou <Sair> para sair");
            aux = input.next();
        }  
    }
}
