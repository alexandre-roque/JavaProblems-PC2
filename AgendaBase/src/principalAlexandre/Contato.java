package principalAlexandre;
public class Contato {
    private String nome;
    private String numTelefone;
    private String endereco;
    private String email;

    public Contato(String nome, String numTelefone, String endereco, String email) {
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
        this.email = email;
    }
    
    public Contato(String nome, String numTelefone) {
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.endereco = "";
        this.email = "";
    }
    
    public Contato() {
        this.nome = "";
        this.numTelefone = "";
        this.endereco = "";
        this.email = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

