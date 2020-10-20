package principalAlexandre;
public class Cubo extends FormaTridimensional{
    private double valorAresta;

    public Cubo(String nomeDaForma, double valorLado) {
        super(nomeDaForma);
        this.valorAresta = valorLado;
    }
    
    public Cubo(String nomeDaForma) {
        super(nomeDaForma);
        this.valorAresta = 0;
    }

    public double getValorAresta() {
        return valorAresta;
    }

    public void setValorAresta(double valorLado) {
        this.valorAresta = valorLado;
    }
    
    @Override
    public double obterArea(){
        return Math.pow(this.getValorAresta(), 2);
    }

    @Override
    public double obterVolume()throws NaoExisteVolumeException {
        return Math.pow(this.getValorAresta(), 3);
    }
}
