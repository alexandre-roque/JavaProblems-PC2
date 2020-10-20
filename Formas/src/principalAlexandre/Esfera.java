package principalAlexandre;
public class Esfera extends FormaTridimensional{
    private double valorRaio;

    public Esfera(String nomeDaForma, double valorRaio) {
        super(nomeDaForma);
        this.valorRaio = valorRaio;
    }
    
    public Esfera(String nomeDaForma) {
        super(nomeDaForma);
        this.valorRaio = 0;
    }

    public double getValorRaio() {
        return valorRaio;
    }

    public void setValorRaio(double valorRaio) {
        this.valorRaio = valorRaio;
    }
    
    @Override
    public double obterArea(){
        return (Math.PI * Math.pow(this.getValorRaio(), 2));
    }
    
    @Override
    public double obterVolume()throws NaoExisteVolumeException {
        return 4/3 * Math.PI * Math.pow(this.getValorRaio(), 3);
    }
    
  
    
}
