package principalAlexandreRoque_VitorSantana;
public class Carro implements PegadaDeCarbono{
    private String modelo;
    private double cilindradaMotor;
    private double distanciaPercorridaPorDia;
    private int qtdPessoasCarro;

    public Carro(String modelo, double cilindradaMotor, double distanciaPercorridaPorDia, int qtdPessoasCarro) {
        this.modelo = modelo;
        this.cilindradaMotor = cilindradaMotor;
        this.distanciaPercorridaPorDia = distanciaPercorridaPorDia;
        this.qtdPessoasCarro = qtdPessoasCarro;
    }
    
    public Carro(){
        
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(double cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }

    public double getDistanciaPercorridaPorDia() {
        return distanciaPercorridaPorDia;
    }

    public void setDistanciaPercorridaPorDia(double distanciaPercorridaPorDia) {
        this.distanciaPercorridaPorDia = distanciaPercorridaPorDia;
    }

    public int getQtdPessoasCarro() {
        return qtdPessoasCarro;
    }

    public void setQtdPessoasCarro(int qtdPessoasCarro) {
        this.qtdPessoasCarro = qtdPessoasCarro;
    }
    
    @Override
    public double getPegadaDeCarbono(){
        double total = 0.0;
        
        if(this.getQtdPessoasCarro() <= 0  || this.getQtdPessoasCarro() > 5)
            System.out.println("Limite de passageiros inválido, retornando 0");
        else{
            if(this.getCilindradaMotor()>=1.0 && this.getCilindradaMotor()<=1.4){

                // A partir do site calculadora.eccaplan.com.br -> 0.37
                total = (this.getDistanciaPercorridaPorDia() * 0.37)/this.getQtdPessoasCarro();

            }
            if(this.getCilindradaMotor()>=1.5 && this.getCilindradaMotor()<=2.0){
                // A partir do site calculadora.eccaplan.com.br -> 0.38
                total = (this.getDistanciaPercorridaPorDia() * 0.38)/this.getQtdPessoasCarro();

            }
            if(this.getCilindradaMotor()>=2.1){
                // A partir do site calculadora.eccaplan.com.br -> 0.49
                total = (this.getDistanciaPercorridaPorDia() * 0.49)/this.getQtdPessoasCarro();

            }
        }
        return total;
    }
}
