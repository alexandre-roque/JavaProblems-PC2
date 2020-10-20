package principal;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        EquacaoSegundoGrau equacaoSegundoGrau = new EquacaoSegundoGrau();
        Scanner input = new Scanner(System.in);
        
        double A;
        double B;
        double C;
        
        double raizes[];
        
        System.out.println("Digite seu A: ");
        A = input.nextDouble();
        
        System.out.println("Digite seu B: ");
        B = input.nextDouble();
        
        System.out.println("Digite seu C: ");
        C = input.nextDouble();
        
        raizes = equacaoSegundoGrau.calcula(A, B, C);
        
        if(raizes != null){
            System.out.println("As raizes da equação são: ");
            for(double raiz: raizes){
                System.out.println(raiz);
            }
        }
        else{
            raizes = null;
            System.out.println("Equação sem raízes reais");
        }
        
    }
 
}
