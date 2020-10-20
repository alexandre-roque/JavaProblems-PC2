package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Comida cocacola = new Comida("Coca Cola", 8, "008");
        Comida guarana = new Comida("Guaraná", 8, "009");
        Comida pipoca = new Comida("Pipoca", 10, "010");
        Comida bala = new Comida("Bala", 0.5, "011");
        Comida fini = new Comida("Fini", 2.50, "012");
        Comida chocolate = new Comida("Barra de Chocolate", 5, "013");
        
        Comida[] comidas = {cocacola, guarana, pipoca, bala, fini, chocolate};
        
        Scanner input = new Scanner(System.in);
        
        Sala sala1 = new Sala(1, 10);
        Sala sala2 = new Sala(2, 10);
        Sala sala3 = new Sala(3, 10);
        Sala sala4 = new Sala(4, 10);
        Sala sala5 = new Sala(5, 10);
        Sala sala6 = new Sala(6, 10);
        
        Filme filme1 = new Filme("Transformers", "Ação","3d", 2006, sala1, "001");
        Filme filme2 = new Filme("Ratatouille", "Animação","2d", 2003, sala2, "002");
        Filme filme3 = new Filme("O mágico de oz", "Fantasia","3d", 2009, sala3, "003");
        Filme filme4 = new Filme("Your Name", "Romance","2d", 2010, sala4, "004");
        Filme filme5 = new Filme("Titanic", "Romance","2d", 1990, sala5, "005");
        Filme filme6 = new Filme("Avengers", "Ação","3d", 2019, sala6, "006");
        
        ArrayList<Filme> filmes = new ArrayList<>();
        
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);
        filmes.add(filme6);
                
        Ingresso ingresso1 = new Ingresso(filme1);
        Ingresso ingresso2 = new Ingresso(filme2); 
        Ingresso ingresso3 = new Ingresso(filme3); 
        Ingresso ingresso4 = new Ingresso(filme4); 
        Ingresso ingresso5 = new Ingresso(filme5); 
        Ingresso ingresso6 = new Ingresso(filme6); 
        
        ArrayList<Ingresso> ingressos = new ArrayList<>();
        
        ingressos.add(ingresso1);
        ingressos.add(ingresso2);
        ingressos.add(ingresso3);
        ingressos.add(ingresso4);
        ingressos.add(ingresso5);
        ingressos.add(ingresso6);
        
        
        Fatura fatura = new Fatura();
        
        System.out.println("Os filmes exibidos hoje são:");
        for(Filme filme: filmes){
            filme.exibirDetalhes();
        }
        System.out.println("\nComidas do bomboniere: ");
        for(Comida comida: comidas){
            comida.exibirDetalhes();
        }
        System.out.println("\n");
        
        String aux = new String();
        int quantidade;
        
        for(int i = 1; i!=0;){
            System.out.println("Digite o código do produto que deseja comprar! Quando acabar, pressione 0");
            aux = input.next();
            
            for (Filme filme : filmes) {
                if(aux.equals(filme.getCodigo())){
                    System.out.print("Digite a quantidade de ingressos: ");
                    quantidade = input.nextInt();
                    for(Ingresso ingresso : ingressos){
                        if(ingresso.getFilme().equals(filme)){
                            fatura.adicionaIngresso(ingresso, quantidade);
                        }
                    }
                }
            }
            
            for(Comida comida : comidas){
                if(aux.equals(comida.getCodigo())){
                    System.out.print("Digite a quantidade desse produto: ");
                    quantidade = input.nextInt();
                    fatura.adicionaComida(comida, quantidade);
                }
            }
            
            if(aux.equals("0")){
                i = 0;
            }
            
        }
        
        sala1.exibeAssentosOcupados();
        
        fatura.listaCompras();
        fatura.listaValor();
        
    }
}
