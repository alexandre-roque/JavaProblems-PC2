package principalAlexandre;

import java.util.ArrayList;
import java.util.HashMap;

public class SuporteTecnico {
    private HashMap<String,String> bancoRepostas;
    private ArrayList<String> respostasPadrao;

    public SuporteTecnico() {
        this.bancoRepostas = new HashMap<>();
        this.respostasPadrao = new ArrayList<>();
        this.colocaBancoSolucao();
        this.colocaRespostasPadrao();
    }

    public HashMap<String, String> getBancoRepostas() {
        return bancoRepostas;
    }

    public void setBancoRepostas(HashMap<String, String> bancoRepostas) {
        this.bancoRepostas = bancoRepostas;
    }

    public ArrayList<String> getRespostasPadrao() {
        return respostasPadrao;
    }

    public void setRespostasPadrao(ArrayList<String> respostasPadrao) {
        this.respostasPadrao = respostasPadrao;
    }
    
    private void colocaBancoSolucao(){
        this.getBancoRepostas().put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        this.getBancoRepostas().put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        this.getBancoRepostas().put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        this.getBancoRepostas().put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        this.getBancoRepostas().put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        this.getBancoRepostas().put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        this.getBancoRepostas().put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        this.getBancoRepostas().put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
        this.getBancoRepostas().put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        this.getBancoRepostas().put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
        this.getBancoRepostas().put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        this.getBancoRepostas().put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");       
    }
    
    private void colocaRespostasPadrao(){
        this.getRespostasPadrao().add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        this.getRespostasPadrao().add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        this.getRespostasPadrao().add("Isso parece interessante. Diga-me mais a respeito...");
        this.getRespostasPadrao().add("Preciso de maiores informações a respeito.");
        this.getRespostasPadrao().add("Você já verificou se existe algum conflito de DLL?");
        this.getRespostasPadrao().add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        this.getRespostasPadrao().add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        this.getRespostasPadrao().add("Isso não é um problema, é apenas uma característica do software!");
        this.getRespostasPadrao().add("Você poderia explicar melhor?");
    }
    
    
}
