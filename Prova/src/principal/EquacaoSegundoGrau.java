package principal;
public class EquacaoSegundoGrau {

    public EquacaoSegundoGrau() {
    }
    
    public double[] calcula(double a, double b, double c){
        double[] raizes = new double[2];
        double x1;
        double x2;
        double delta = (Math.pow(b,2) - 4*a*c);
        
        if(delta < 0){
            return null;
        }
        else{
            x1 = (-b + (Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a) ;
            x2 = (-b - (Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a) ;
            raizes[0] = x1;
            raizes[1] = x2;
            return raizes;
        }        
    }
}
