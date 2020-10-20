package principalAlexandre;
public class NaoExisteVolumeException extends Exception{
    public NaoExisteVolumeException(){
        super("Nao é possível calcular o volume em uma forma bidimensional");
    }
    
}
