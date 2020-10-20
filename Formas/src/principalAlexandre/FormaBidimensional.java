package principalAlexandre;
public abstract class FormaBidimensional extends Forma{
    private String nomeDaForma;
    
    public FormaBidimensional(String nomeDaForma) {
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
