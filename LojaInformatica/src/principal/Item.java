package principal;
public class Item {
    private Produto produto;
    private int quantidadeProduto;

    public Item(Produto produto, int quantidadeProduto) {
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
    }
    public Item() {
        this.produto = null;
        this.quantidadeProduto = 0;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
}
