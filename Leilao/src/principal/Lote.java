package principal;
public class Lote {
    private String descricao;
    private Lance maiorLance;

    public Lote(String descricao, Lance maiorLance){
        this.descricao = descricao;
        this.maiorLance = maiorLance;
    }
    
    public Lote(){}
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }
    
    public void verificaLance(Lance lance){
        
    }
    
}
