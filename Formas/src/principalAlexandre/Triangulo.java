package principalAlexandre;
public class Triangulo extends FormaBidimensional{
    private double valorBase;
    private double valorAltura;

    public Triangulo(String nomeDaForma, double valorBase, double valorAltura) {
        super(nomeDaForma);
        this.valorBase = valorBase;
        this.valorAltura = valorAltura;
    }
    
    public Triangulo(String nomeDaForma) {
        super(nomeDaForma);
        this.valorBase = 0;
        this.valorAltura = 0;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(double valorAltura) {
        this.valorAltura = valorAltura;
    }
    
    @Override
    public double obterArea(){
        return ((this.getValorBase() * this.getValorAltura())/2);
    }
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
}
