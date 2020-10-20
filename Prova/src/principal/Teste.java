package principal;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(10,10);
        Ponto2D ponto3 = new Ponto2D(ponto2);
        Ponto2D ponto4 = new Ponto2D(5,10);
        
        ArrayList<Triangulo> triangulos = new ArrayList();
        
        Ponto2D pontoTrianguloIsoceles1 = new Ponto2D(-2,3);
        Ponto2D pontoTrianguloIsoceles2 = new Ponto2D(3,2);
        Ponto2D pontoTrianguloIsoceles3 = new Ponto2D(-1,-2);
        
        if(Triangulo.formaTriangulo(pontoTrianguloIsoceles1, pontoTrianguloIsoceles2, pontoTrianguloIsoceles3)){
            Triangulo trianguloIsoceles = new Triangulo(pontoTrianguloIsoceles1, pontoTrianguloIsoceles2, pontoTrianguloIsoceles3);
            triangulos.add(trianguloIsoceles);
        }
        
        Ponto2D pontoTrianguloEquilatero1 = new Ponto2D(0,0);
        Ponto2D pontoTrianguloEquilatero2 = new Ponto2D(4,0);
        Ponto2D pontoTrianguloEquilatero3 = new Ponto2D(2,2*Math.sqrt(3));

        if(Triangulo.formaTriangulo(pontoTrianguloEquilatero1, pontoTrianguloEquilatero2, pontoTrianguloEquilatero3)){
            Triangulo trianguloEquilatero = new Triangulo(pontoTrianguloEquilatero1, pontoTrianguloEquilatero2, pontoTrianguloEquilatero3);
            triangulos.add(trianguloEquilatero);
        }
        
        Ponto2D pontoTrianguloEscaleno1 = new Ponto2D(-3,1);
        Ponto2D pontoTrianguloEscaleno2 = new Ponto2D(-2,5);
        Ponto2D pontoTrianguloEscaleno3 = new Ponto2D(3,4);
        
        
        if(Triangulo.formaTriangulo(pontoTrianguloEscaleno1, pontoTrianguloEscaleno2, pontoTrianguloEscaleno3)){
            Triangulo trianguloEscaleno = new Triangulo(pontoTrianguloEscaleno1, pontoTrianguloEscaleno2, pontoTrianguloEscaleno3);
            triangulos.add(trianguloEscaleno);
        }
        
        Ponto2D pontoNaoTriagulo1 = new Ponto2D(0,0);
        Ponto2D pontoNaoTriagulo2 = new Ponto2D(0,100);
        Ponto2D pontoNaoTriagulo3 = new Ponto2D(0,2);
        
        
        if(Triangulo.formaTriangulo(pontoNaoTriagulo1, pontoNaoTriagulo2, pontoNaoTriagulo3)){
            System.out.println("é triangulo!");
        }
        else{
            System.out.println("Os pontos: \nX:"+pontoNaoTriagulo1.getX()+" Y:"+pontoNaoTriagulo1.getY());
            System.out.println("X:"+pontoNaoTriagulo2.getX()+" Y:"+pontoNaoTriagulo2.getY());
            System.out.println("X:"+pontoNaoTriagulo3.getX()+" Y:"+pontoNaoTriagulo3.getY());
            
            System.out.println("Não formam triangulo!\n");
        }
        
        for(Triangulo triangulo: triangulos){
            System.out.println("O triangulo de vertices:");
            triangulo.exibirVertices();
            if(triangulo.equilatero())
                System.out.println("É equilatero");
            if(triangulo.escaleno())
                System.out.println("É escaleno");
            if(triangulo.isoceles())
                System.out.println("É isoceles");
            System.out.println("O perimetro é: "+triangulo.perimetro());
            System.out.println("A area é: "+triangulo.area()+"\n\n");
            
        }     
    }
}
