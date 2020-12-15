package principalAlexandreRoque_VitorSantana;
public class Tesoura extends Elemento{

    public Tesoura(String nomeElemento) {
        super(nomeElemento);
    }

   @Override
    public void compara(Elemento elementoAdversario) {
        if(elementoAdversario instanceof Tesoura){
            System.out.println("Empate");  
        }
        if(elementoAdversario instanceof Papel){
            System.out.println(this.getNomeElemento()+" cortou "+elementoAdversario.getNomeElemento()+"!! (Perdeu!)");  
        }
        if(elementoAdversario instanceof Pedra){
            System.out.println(this.getNomeElemento()+" foi quebrada por "+elementoAdversario.getNomeElemento()+"!! (Perdeu!)"); 
        }  
    }
    
}
