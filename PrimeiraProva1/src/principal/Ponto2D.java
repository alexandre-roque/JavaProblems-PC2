package principal;
public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto2D(Ponto2D pontoBidimensional) {
        this.x = pontoBidimensional.getX();
        this.y = pontoBidimensional.getY();  
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularDistancia(Ponto2D pontoPassado){
        double distancia;
        distancia = Math.sqrt(Math.pow((this.getX() - pontoPassado.getX()),2) + Math.pow((this.getY() - pontoPassado.getY()),2));
        return distancia;
    }
    
}
