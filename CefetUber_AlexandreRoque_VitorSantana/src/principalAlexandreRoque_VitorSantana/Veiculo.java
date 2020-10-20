package principalAlexandreRoque_VitorSantana;

import java.util.ArrayList;
import java.util.Random;

public class Veiculo {
    private String modelo;
    private Motorista motorista;
    private ArrayList<Passageiro> passageiros;
    private int capacidade;
    private double valorTotal;
    private String codigo;
    
    public Veiculo(String modelo, int capacidade, String codigo) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.passageiros = new ArrayList<>();
        this.valorTotal = valorTotal;
        this.motorista = null;
        this.codigo = codigo;
    }
    
    public Veiculo() {
        this.motorista = null;
        this.passageiros = null;
        this.modelo = "";
        this.valorTotal = 0;
        this.capacidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void adicionaMotorista(Motorista motorista){
        this.setMotorista(motorista);
    }
    
    public void adicionaPassageiro(Passageiro passageiro){
        this.getPassageiros().add(passageiro);
    }
    
    public double calculaGanhoAdministracao(){
        return this.getValorTotal()*(0.3);
    }
    
    public double calculaGanhoMotorista(){
        return this.getValorTotal()*(0.7);
    }
    
    public void fazerCorrida(String destino){
        
        if(!(this.getPassageiros().size() < 0) || !(this.getPassageiros().size() > this.getCapacidade() - 1)){
            this.setPassageiros(this.getPassageiros());
            System.out.println("Indo para: "+destino);
        }
        else
            System.out.println("Capacidade inválida");
    }

    public void finalizaCorrida(){
        Random gerador = new Random();
        this.setValorTotal(this.getValorTotal() + gerador.nextInt(100));
        this.setPassageiros(new ArrayList<>());
    }
    
    public void listaDetalhes(){
        System.out.println("Modelo: "+this.getModelo()+ "com capacidade de: "+this.getCapacidade()+" CÓDIGO: "+this.getCodigo());
    }
}
