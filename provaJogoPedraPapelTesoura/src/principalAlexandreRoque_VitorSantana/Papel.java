package principalAlexandreRoque_VitorSantana;
public class Papel extends Elemento{

    public Papel(String nomeElemento) {
        super(nomeElemento);
    }

    @Override
    public void compara(Elemento elementoAdversario) {
        if(elementoAdversario instanceof Papel){
            System.out.println("Empate");  
        }
        if(elementoAdversario instanceof Pedra){
            System.out.println(this.getNomeElemento()+" envolveu "+elementoAdversario.getNomeElemento()+"!! (Perdeu!)");   
        }
        if(elementoAdversario instanceof Tesoura){
            System.out.println(this.getNomeElemento()+" foi cortado por "+elementoAdversario.getNomeElemento()+"!! (Perdeu!)"); 
        }  
    }
    
    
}
