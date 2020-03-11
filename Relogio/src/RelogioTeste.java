public class RelogioTeste {
    public static void main(String[] args) {
        Contador contHora = new Contador(0,23);
        Contador contMinuto = new Contador(0,59);
        Relogio relogio = new Relogio(contHora,contMinuto,true);
        for(int i = 0;i<1440;i++){
            relogio.ticTac();
            relogio.mostrarHora();
        }
    }
}
