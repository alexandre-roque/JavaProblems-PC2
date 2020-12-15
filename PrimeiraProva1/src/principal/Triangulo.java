package principal;
public class Triangulo {
    private Ponto2D vertice1; 
    private Ponto2D vertice2;
    private Ponto2D vertice3;

    public Triangulo(Ponto2D vertice1, Ponto2D vertice2, Ponto2D vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    
    public Triangulo() {
        this.vertice1 = null;
        this.vertice2 = null;
        this.vertice3 = null;
    }

    public Ponto2D getVertice1() {
        return vertice1;
    }

    public void setVertice1(Ponto2D vertice1) {
        this.vertice1 = vertice1;
    }

    public Ponto2D getVertice2() {
        return vertice2;
    }

    public void setVertice2(Ponto2D vertice2) {
        this.vertice2 = vertice2;
    }

    public Ponto2D getVertice3() {
        return vertice3;
    }

    public void setVertice3(Ponto2D vertice3) {
        this.vertice3 = vertice3;
    }
    
    
    
    
    static boolean formaTriangulo (Ponto2D p1, Ponto2D p2, Ponto2D p3){
        double A = p1.calcularDistancia(p2);
        double B = p2.calcularDistancia(p3);
        double C = p1.calcularDistancia(p3);
        
        if( ((A + B) > C) &&  ((A + C) > B) && ((B + C) > A)){
            return true;
        }
        else
            return false;
    }
    
    public boolean equilatero(){
        double A = Math.round(this.vertice1.calcularDistancia(vertice2));
        double B = Math.round(this.vertice2.calcularDistancia(vertice3));
        double C = Math.round(this.vertice1.calcularDistancia(vertice3));
        
        
        if(A == B && A == C){
            return true;
        }
        else
            return false;
    }
    
    public boolean isoceles(){
        double A = this.vertice1.calcularDistancia(vertice2);
        double B = this.vertice2.calcularDistancia(vertice3);
        double C = this.vertice3.calcularDistancia(vertice1);
        
        //System.out.println(A+" "+B+" "+C);
        
        if(A == B && A != C){
            return true;
        }
        else if(A == C && A != B){
            return true;
        }
        else if(B == C && B != A){
            return true;
        }
        else
            return false;
    }
    
    public boolean escaleno(){
        double A = this.vertice1.calcularDistancia(vertice2);
        double B = this.vertice2.calcularDistancia(vertice3);
        double C = this.vertice3.calcularDistancia(vertice1);
        
        //System.out.println(A+" "+B+" "+C);
        
        if(A != B && B != C && A != C){
            return true;
        }
        else
            return false; 
    }
    
    public double perimetro(){
        double A = this.vertice1.calcularDistancia(vertice2);
        double B = this.vertice2.calcularDistancia(vertice3);
        double C = this.vertice3.calcularDistancia(vertice1);
        return A + B + C;
        
    } 
    
    public double area(){
        double A = this.vertice1.calcularDistancia(vertice2);
        double B = this.vertice2.calcularDistancia(vertice3);
        double C = this.vertice3.calcularDistancia(vertice1);
        double sp = (A + B + C)/2;
        
        return Math.sqrt(sp *(sp - A) * (sp - B) * (sp - C));
        
    }
    
    public void exibirVertices(){
        System.out.println("Vertice: 1");
        System.out.println("x:"+this.getVertice1().getX());
        System.out.println("y:"+this.getVertice1().getY());
        
        System.out.println("Vertice: 2");
        System.out.println("x:"+this.getVertice2().getX());
        System.out.println("y:"+this.getVertice2().getY());
        
        System.out.println("Vertice: 3");
        System.out.println("x:"+this.getVertice3().getX());
        System.out.println("y:"+this.getVertice3().getY());
        
    }
}


