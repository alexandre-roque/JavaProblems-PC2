package principalAlexandre;

import java.util.ArrayList;

public class TrataFormas {
    private ArrayList<Forma> formas;

    public TrataFormas() {
        this.formas = new ArrayList<>();
    }
    
    public TrataFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

}
