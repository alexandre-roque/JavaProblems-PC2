package principalAlexandreRoque_VitorSantana;
public abstract class Elemento {
    protected String nomeElemento;

    public Elemento(String nomeElemento) {
        this.nomeElemento = nomeElemento;
    }

    public String getNomeElemento() {
        return nomeElemento;
    }

    public void setNomeElemento(String nomeElemento) {
        this.nomeElemento = nomeElemento;
    }

    public abstract void compara(Elemento elementoAdversario);
 
}
