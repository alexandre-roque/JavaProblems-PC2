package principalAlexandreRoque_VitorSantana;
public class Pedra extends Elemento{

    public Pedra(String nomeElemento) {
        super(nomeElemento);
    }

    @Override
    public void compara(Elemento elementoAdversario) {
        if(elementoAdversario instanceof Pedra){
            System.out.println("Empate");  
        }
        if(elementoAdversario instanceof Papel){
            System.out.println(this.getNomeElemento()+" foi envolvido por "+elementoAdversario.getNomeElemento()+"!! (Perdeu!)");  
        }
        if(elementoAdversario instanceof Tesoura){
           System.out.println(this.getNomeElemento()+" quebrou "+elementoAdversario.getNomeElemento()+"!! (Ganhou!)");   
        }  
    }
}
