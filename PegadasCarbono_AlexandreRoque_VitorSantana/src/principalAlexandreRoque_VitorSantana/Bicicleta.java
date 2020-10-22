package principalAlexandreRoque_VitorSantana;
public class Bicicleta implements PegadaDeCarbono{
    private String modelo;
    private double qtdQuiloBorracha;
    private double qtdQuiloMetal;

    public Bicicleta(String modelo, double qtdQuiloBorracha, double qtdQuiloMetal) {
        this.modelo = modelo;
        this.qtdQuiloBorracha = qtdQuiloBorracha;
        this.qtdQuiloMetal = qtdQuiloMetal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getQtdQuiloBorracha() {
        return qtdQuiloBorracha;
    }

    public void setQtdQuiloBorracha(double qtdQuiloBorracha) {
        this.qtdQuiloBorracha = qtdQuiloBorracha;
    }

    public double getQtdQuiloMetal() {
        return qtdQuiloMetal;
    }

    public void setQtdQuiloMetal(double qtdQuiloMetal) {
        this.qtdQuiloMetal = qtdQuiloMetal;
    }
 
    @Override
    public double getPegadaDeCarbono(){
        double total = 0;
        total = this.getQtdQuiloBorracha() * 0.88;
        total+= this.getQtdQuiloMetal() * 0.18;
        return total;
    }
}
