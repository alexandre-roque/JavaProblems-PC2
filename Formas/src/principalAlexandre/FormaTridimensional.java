package principalAlexandre;
public abstract class FormaTridimensional extends Forma{  
    private String nomeDaForma;

    public FormaTridimensional(String nomeDaForma) {
        this.nomeDaForma = nomeDaForma;
    }

    @Override
    public String getNomeDaForma() {
        return nomeDaForma;
    }

    @Override
    public void setNomeDaForma(String nomeDaForma) {
        this.nomeDaForma = nomeDaForma;
    }
    
    @Override
    public abstract double obterArea();
    
    @Override
    public abstract double obterVolume() throws NaoExisteVolumeException;
}
