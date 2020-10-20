package principalAlexandre;
public class Quadrado extends FormaBidimensional{
    private double valorAresta;

    public Quadrado(String nomeDaForma, double valorAresta) {
        super(nomeDaForma);
        this.valorAresta = valorAresta;
    }
    
    public Quadrado(String nomeDaForma) {
        super(nomeDaForma);
        this.valorAresta = 0;
    }

    public double getValorAresta() {
        return valorAresta;
    }

    public void setValorAresta(double valorAresta) {
        this.valorAresta = valorAresta;
    }
    
    @Override
    public double obterArea(){
        return Math.pow(this.getValorAresta(), 2);
    } 
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
    
}
