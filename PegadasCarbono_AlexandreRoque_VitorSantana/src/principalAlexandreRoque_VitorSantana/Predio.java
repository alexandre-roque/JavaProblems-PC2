package principalAlexandreRoque_VitorSantana;
public class Predio implements PegadaDeCarbono {
    
    private String nomeEdificio;
    private String descricaoEdificio;
    private double qntdBotijaoGas; 
    private double energiaEletricaConsumidaMes;

    public Predio(String nomeEdificio, String descricaoEdificio, double qntdBotijaoGas, double energiaEletricaConsumidaMes) {
        this.nomeEdificio = nomeEdificio;
        this.descricaoEdificio = descricaoEdificio;
        this.qntdBotijaoGas = qntdBotijaoGas;
        this.energiaEletricaConsumidaMes = energiaEletricaConsumidaMes;
    }

    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public String getDescricaoEdificio() {
        return descricaoEdificio;
    }

    public void setDescricaoEdificio(String descricaoEdificio) {
        this.descricaoEdificio = descricaoEdificio;
    }

    public double getQntdBotijaoGas() {
        return qntdBotijaoGas;
    }

    public void setQntdBotijaoGas(double qntdBotijaoGas) {
        this.qntdBotijaoGas = qntdBotijaoGas;
    }

    public double getEnergiaEletricaConsumidaMes() {
        return energiaEletricaConsumidaMes;
    }

    public void setEnergiaEletricaConsumidaMes(double energiaEletricaConsumidaMes) {
        this.energiaEletricaConsumidaMes = energiaEletricaConsumidaMes;
    }
    
    @Override
    public double getPegadaDeCarbono(){
        double total = 0; // A partir do site http://www.iniciativaverde.org.br/calculadora/index.php#calculadora.
        total = this.getEnergiaEletricaConsumidaMes() * 0.163; // 0.163 kg de CO2-eq por kWh.
        total+= this.getQntdBotijaoGas() * 149.04;// 149.04 kg de CO2-eq por Botijão de Gás.
        return total ;
    }
    
    
    
}
