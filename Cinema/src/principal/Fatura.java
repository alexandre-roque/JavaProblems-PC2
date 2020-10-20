package principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Fatura {
    private ArrayList<Comida> comidasCompradas;
    private ArrayList<Ingresso> ingressoComprados;

    public Fatura() {
        this.comidasCompradas =  new ArrayList<>();
        this.ingressoComprados = new ArrayList<>();
    }

    public ArrayList<Comida> getComidasCompradas() {
        return comidasCompradas;
    }

    public void setComidasCompradas(ArrayList<Comida> comidasCompradas) {
        this.comidasCompradas = comidasCompradas;
    }

    public ArrayList<Ingresso> getIngressoComprados() {
        return ingressoComprados;
    }

    public void setIngressoComprados(ArrayList<Ingresso> ingressoComprados) {
        this.ingressoComprados = ingressoComprados;
    }
    
    public void listaCompras(){
        System.out.println("Ingressos comprados:");
        for(Ingresso ingresso:this.getIngressoComprados()){
            System.out.println(ingresso.getFilme().getTitulo()+"\tValor:"+ingresso.getValor());
        }
        System.out.println("Produtos comprados:");
        for(Comida comida:this.getComidasCompradas()){
            System.out.println(comida.getNome()+"\tValor:"+comida.getValor());
        }
    }
    
    public void listaValor(){
        double total = 0;
        for(Ingresso ingresso:this.getIngressoComprados()){
            total+=ingresso.getValor();
        }
        for(Comida comida:this.getComidasCompradas()){
            total+=comida.getValor();
        }
        System.out.println("O valor total é: "+total);
    }
    
    public void adicionaComida(Comida comida, int quantidade){
        for(int i = 0; i < quantidade; i++)
            this.comidasCompradas.add(comida);
    }
    
    public void adicionaIngresso(Ingresso ingresso, int quantidade){

        for(int i = 0; i < quantidade;i++){
            if(ingresso.getFilme().getSala().getQuantidadeAtual() < ingresso.getFilme().getSala().getCapacidade()){
                this.ingressoComprados.add(ingresso);
                ingresso.getFilme().getSala().ocupaAssento(ingresso);
            }
            else{
                System.out.println("A sala está lotada");
                break;
            }
        }
    }
}
