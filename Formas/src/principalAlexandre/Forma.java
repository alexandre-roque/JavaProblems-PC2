package principalAlexandre;
public abstract class  Forma {
    private String nomeDaForma;    

    public String getNomeDaForma() {
        return nomeDaForma;
    }

    public void setNomeDaForma(String nomeDaForma) {
        this.nomeDaForma = nomeDaForma;
    }

    public abstract double obterArea();
    public abstract double obterVolume() throws NaoExisteVolumeException ;
    
}
