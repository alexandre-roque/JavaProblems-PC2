package principal;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        
        Produto cooler = new Produto("Cooler para processador", 40.00, 2001);
        Produto mouse = new Produto("Mouse Gamer sem fio    ", 70.00, 2002);
        Produto teclado = new Produto("Teclado Mecânico       ", 125.00, 2003);
        Produto monitor = new Produto("Monitor LED 24’’       ", 692.00, 2004);
        Produto gabinete = new Produto("Gabinete Gamer 2.0     ", 100.00, 2005);
        Produto headset = new Produto("Headset Gamer 7.1      ",299.00, 2006);
        
        Produto[] produtos = {cooler, mouse, teclado, monitor, gabinete, headset};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a loja!\nNossos produtos:\t\tPreço:\t\t\tCódigo:");
        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i].getDescricao()+"\t\tR$: "+produtos[i].getValor()+"\t\t"+produtos[i].getCodigo());
        }
        
        int code = 0;
        int qnt = 0;
        int qntTotal = 0;
        int auxTotal = 0;
        int cont = 0;
        System.out.println("Quantos produtos no total você irá comprar?");
        qntTotal = input.nextInt();
        Fatura fatura = new Fatura(qntTotal);
        for (int i = 0; i != 1 ;){
            if (auxTotal >= qntTotal){
                    System.out.println("Limite atingido! Fechando compra! ");
                    break;
            }
            System.out.println("Quais produtos deseja adquirir? Digite o seu código:(Digite 0 se quiser sair)");
            code = input.nextInt();
            for(int k = 0; k<produtos.length; k++){
                if(code != produtos[k].getCodigo()){
                    cont++;
                }
                if(cont == produtos.length){
                    System.out.println("Produto Inválido! Digite novamente:");
                    cont = 0;
                }
            }
                
            for(int j = 0; j<produtos.length; j++){
                if(code == produtos[j].getCodigo()){
                    System.out.println("Qual a quantidade desse produto?");
                    qnt = input.nextInt();
                    auxTotal += qnt;
                    Item compra = new Item(produtos[j],qnt);
                    fatura.adicionaItem(compra);
                }
                if(code == 0){
                    i=1;
                }
            }
        }
        
        fatura.listaItens();
        System.out.println("O total da compra é: R$"+fatura.calculaTotal());
        
    }
}
