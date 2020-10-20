package principalAlexandre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;

public class Interpretadora {
    private HashSet<String> palavraChave;
    private SuporteTecnico suporte;
    
    public Interpretadora(SuporteTecnico suporte) {
        this.palavraChave = new HashSet<>();
        this.suporte = new SuporteTecnico();
    }

    public HashSet<String> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(HashSet<String> palavraChave) {
        this.palavraChave = palavraChave;
    }

    public SuporteTecnico getSuporte() {
        return suporte;
    }

    public void setSuporte(SuporteTecnico suporte) {
        this.suporte = suporte;
    }
    
    public String interpreta(String texto){
        this.setPalavraChave(new HashSet<>()); 
        StringTokenizer st = new StringTokenizer(texto);
        
        while (st.hasMoreTokens()) {
            this.getPalavraChave().add(st.nextToken());
        }
        
        Set<String> chaves = this.getSuporte().getBancoRepostas().keySet();
        Iterator<String> it = chaves.iterator();
        
        while(it.hasNext()){
            String aux = it.next();
            for(String palavra : this.getPalavraChave()){
                if(palavra != null){
                    if(palavra.equals(aux)){
                        return (this.getSuporte().getBancoRepostas().get(aux));
                    }  
                }
            }
        }
        
        Random gerador = new Random();
        return this.getSuporte().getRespostasPadrao().get(gerador.nextInt(this.getSuporte().getRespostasPadrao().size()));
        
    }
    
    
    
    
    
}
