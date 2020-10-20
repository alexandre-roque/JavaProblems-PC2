package principalAlexandre;

public class Teste {
    public static void main(String[] args) {
        TrataFormas trataformas = new TrataFormas();
        
        Forma quadrado = new Quadrado("Quadrado", 10); //Parâmetro: Valor da aresta
        Forma triangulo = new Triangulo("Triângulo", 5,7); //Parâmetro: Valor da base e da altura
        Forma circulo = new Circulo("Circulo", 4); //Parâmetro: Valor do raio
        Forma cubo = new Cubo("Cubo", 7); //Parâmetro: Valor da aresta
        Forma tetraedro = new Tetraedro("Tetraedro", 6); //Parâmetro: Valor da aresta
        Forma esfera = new Esfera("Esfera", 5); //Parâmetro: Valor do raio
        
        trataformas.getFormas().add(quadrado);
        trataformas.getFormas().add(triangulo);
        trataformas.getFormas().add(circulo);
        trataformas.getFormas().add(cubo);
        trataformas.getFormas().add(tetraedro);
        trataformas.getFormas().add(esfera);  

        
        for(Forma forma: trataformas.getFormas()){
            System.out.println("Forma: "+forma.getNomeDaForma());
            System.out.println("Área: "+forma.obterArea());
            try {
                System.out.println("Volume: "+forma.obterVolume());
            } catch (NaoExisteVolumeException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
        
    }    
}
