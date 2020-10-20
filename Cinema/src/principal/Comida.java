package principal;
public class Comida {
    private String nome;
    private double valor;
    private String codigo;

    public Comida(String nome, double valor, String codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Comida() {
        this.nome = "";
        this.valor = 0;
        this.codigo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    


    public void exibirDetalhes(){
        System.out.println(this.getNome()+" e custa R$"+this.getValor()+" // CODIGO: "+this.getCodigo());
    }
}
