public class Teste {
    import java.util.Random;
    import java.util.Scanner;
    
    public static void main(String[] args){ 
        
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int notas[];
    
    Random gerador = new Random();
       for(int i=0;i<num;i++){
            notas[i] = gerador.nextInt(10)+1;
       } 
    
    }
}
