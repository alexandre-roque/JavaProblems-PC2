package principalAlexandre;
public class Circulo extends FormaBidimensional{
    private double valorRaio;

    public Circulo(String nomeDaForma, double valorRaio) {
        super(nomeDaForma);
        this.valorRaio = valorRaio;
    }
    
    public Circulo(String nomeDaForma) {
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
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
    
}

