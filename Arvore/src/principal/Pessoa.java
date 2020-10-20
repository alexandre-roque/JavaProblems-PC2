package principal;
public class Pessoa {
    private String nome;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    public boolean verificaIgualdade(Pessoa pessoa){
        if(this.getNome().equals(pessoa.getNome()) && this.getMae().equals(pessoa.getMae()) && this.getPai().equals(pessoa.getPai())){
            return true;
        }
        else
            return false;
    }
    
    public boolean verificaIrmandade(Pessoa pessoa){
        if(pessoa.getMae() != null && pessoa.getPai() != null && this.getMae().getNome().equals(pessoa.getMae().getNome()) && this.getPai().getNome().equals(pessoa.getPai().getNome())){
            if(this.getNome().equals(pessoa.getNome()))
                return false;
            return true;
        }
        else
            return false;
    }
    
    public boolean verificaAntecessor(Pessoa pessoa){
        if(this.getMae().getNome().equals(pessoa.getNome()) || this.getPai().getNome().equals(pessoa.getNome()))
            return true;      
        if(this.getMae().getMae()!= null && this.getMae().getMae().getNome().equals(pessoa.getNome()))
            return true;
        if(this.getMae().getPai()!= null && this.getMae().getPai().getNome().equals(pessoa.getNome()))
            return true;
        if(this.getPai().getMae()!= null && this.getPai().getMae().getNome().equals(pessoa.getNome()))
            return true;
        if(this.getPai().getPai()!= null && this.getPai().getPai().getNome().equals(pessoa.getNome()))
            return true;
        return false;
    }
    
}
