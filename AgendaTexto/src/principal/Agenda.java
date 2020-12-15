package principal;

import java.util.HashMap;
import java.util.Set;
import textFileApps.CreateTextFile;

public class Agenda {
    private HashMap<String,Contato> agenda;

    public Agenda() {
        this.agenda = new HashMap<>();
    }

    public HashMap<String, Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(HashMap<String, Contato> agenda) {
        this.agenda = agenda;
    }

    public boolean inserirContato(Contato contato) {
        if(contato.getNome().equals("")){ //Verificando se todos os dados estão preenchidos
            return false;
        }
        else if(contato.getTelefone().equals("")){
            return false;
        }
        else if(contato.getEndereco().equals("")){
            return false;
        }
        else if(contato.getEmail().equals("")){
            return false;
        }
        
        
        Set<String> chaves = this.getAgenda().keySet();
        for(String chave: chaves){ //Sobrescrevendo e alterando o contato, se ele já existir (Opção de alterar dados)
            if(contato.getNome().equals(this.getAgenda().get(chave).getNome())){
                this.getAgenda().get(chave).setNome(contato.getNome());
                this.getAgenda().get(chave).setTelefone(contato.getTelefone());
                this.getAgenda().get(chave).setEndereco(contato.getEndereco());
                this.getAgenda().get(chave).setEmail(contato.getEmail());
                return true;
            }
        }
        
        this.getAgenda().put(contato.getTelefone(), contato); // Inserindo o contato no HashMap
        return true;
    }

    public void gravar() {
        Set<String> chaves = this.getAgenda().keySet();
        for(String chave: chaves){
            CreateTextFile.addRecords(this.getAgenda().get(chave)); //Gravando os contatos no arquivo "agendaPessoal.txt"
        }
    }

    public Contato pesquisar(String nome) {
            Contato contato = new Contato();
            Set<String> chaves = this.getAgenda().keySet();
            for(String chave: chaves){
                if(this.getAgenda().get(chave).getNome().startsWith(nome)){ //Verifica se o começo é igual
                    return this.getAgenda().get(chave);
                }
                if(this.getAgenda().get(chave).getNome().equals(nome)){ //Verifica se é todo igual
                    return this.getAgenda().get(chave);
                }
            }
            return contato;
    }

    public String[] listaContatos(){
        String[] contatos = new String[this.getAgenda().size()];
        Set<String> chaves = this.getAgenda().keySet();
        int i = 0;
        for(String chave: chaves){
            contatos[i] = this.getAgenda().get(chave).getNome();
            i++;
        }
        return contatos;
    }
    
    public void apagarContato(Contato c){
        this.getAgenda().remove(c.getTelefone());
        //this.gravar();
    }
}
