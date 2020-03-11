package main;
    import java.util.Random;
    import java.util.Scanner;

    public class Teste {
        public static void main(String[] args){ 

        System.out.print("Número de clientes:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int notas[] = new int[num] ;

        Enquete enquete = new Enquete();
        
        Random gerador = new Random();
           for(int i=0;i<num;i++){
                notas[i] = gerador.nextInt(10)+1;
           } 

        }
    }
