package principalAlexandre;
public class Tetraedro extends FormaTridimensional{
    private double valorAresta;

    public Tetraedro(String nomeDaForma, double valorAresta) {
        super(nomeDaForma);
        this.valorAresta = valorAresta;
    }
    
    public Tetraedro(String nomeDaForma) {
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
        return ((Math.pow(this.getValorAresta(), 2) * Math.sqrt(3)) /4 );
    }
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException{     
        return (Math.pow(this.getValorAresta(), 3) * Math.sqrt(2))/12;
    }
}
