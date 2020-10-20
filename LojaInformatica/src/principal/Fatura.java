package principal;
public class Fatura {
    private Item[] itens;
    private int quantidadeAtual;
    private int tamanho;
    
    public Fatura(int tamanho) {
        this.tamanho = tamanho;
        this.itens = new Item[tamanho];
        this.quantidadeAtual = 0;
    }
   /* public Fatura() {
        this.tamanho = 0;
        this.itens = null;
        this.quantidadeAtual = 0;
    }*/
    
    public Item[] getItens() {
        return itens;
    }
    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }
    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
   public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionaItem(Item itemAdicionado){
        for(int i =1 ; i<=itemAdicionado.getQuantidadeProduto(); i++){
            if (this.quantidadeAtual<this.getTamanho()){
                this.itens[this.quantidadeAtual] = itemAdicionado;
                this.quantidadeAtual += 1;
            }
            else
                System.out.println("Limite alcançado");
        }
    }
    public double calculaTotal(){
        double total = 0;
        for(int i = 0; i<this.getTamanho();i++){
            if(this.itens[i] != null){
            total += this.itens[i].getProduto().getValor();
            }
        }
        return total;
    }
    public void listaItens(){
        System.out.println("Produto\t\t\t\tQuantidade");
        for(int i =0; i<this.getTamanho(); i++){
            if(this.itens[i] != null){
                System.out.println(this.itens[i].getProduto().getDescricao()+"\t\t1");
            }
        }
    }
}
