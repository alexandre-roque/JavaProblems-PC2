import java.util.Scanner;
public class RelogioTeste {
    public static void main(String[] args) {
        Contador contHora = new Contador(0,24);
        Contador contMinuto = new Contador(0,60);
        System.out.println("Se quiser o formato 24 horas, digite 1");
        System.out.println("Se quiser o formato 12 horas, digite 0");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean formato;
        formato = num != 0;
        Relogio relogio = new Relogio(contHora,contMinuto,formato);
        for(int i = 0;i<1441;i++){
                        relogio.mostrarHora();
                        relogio.ticTac();
        }
    }
}
