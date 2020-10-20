package principal;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa sonia = new Pessoa("Sonia");
        Pessoa ernandes = new Pessoa("Ernandes");
        Pessoa ines = new Pessoa("Ines");
        Pessoa padrinho = new Pessoa("Padrinho");
        Pessoa ana = new Pessoa("Ana",ines,padrinho);
        Pessoa maria = new Pessoa("Maria",ines,padrinho);
        Pessoa alexandre = new Pessoa("Alexandre",sonia,ernandes);
        Pessoa andrea  = new Pessoa("Andrea",sonia,ernandes);
        Pessoa julia = new Pessoa("Julia",maria,alexandre);
        Pessoa joao = new Pessoa("Joao",maria,alexandre);
        Pessoa ricardo = new Pessoa("Ricardo",maria,alexandre);
        
        System.out.println("Testes:");
        
        System.out.println("1.1 - Verifica igualdade: "+joao.getNome()+" e "+alexandre.getNome());
        if(joao.verificaIgualdade(alexandre))
            System.out.println("é a mesma pessoa");
        else
            System.out.println("não é a mesma pessoa");
        System.out.println("1.2 - "+julia.getNome()+" e "+julia.getNome());
        if(julia.verificaIgualdade(julia))
            System.out.println("é a mesma pessoa");
        else
            System.out.println("não é a mesma pessoa");
        
        System.out.println("2.1 - Verifica irmandade: "+ricardo.getNome()+" e "+ines.getNome());
        if(ricardo.verificaIrmandade(ines))
            System.out.println("é irmão/irmã");
        else
            System.out.println("não é irmão/irmã");
        System.out.println("2.2 - "+maria.getNome()+" e "+ana.getNome());
        if(maria.verificaIrmandade(ana))
            System.out.println("é irmão/irmã");
        else
            System.out.println("não é irmão/irmã");
        System.out.println("2.3 - "+alexandre.getNome()+" e "+andrea.getNome());
        if(alexandre.verificaIrmandade(andrea))
            System.out.println("é irmão/irmã");
        else
            System.out.println("não é irmão/irmã");
        System.out.println("2.4 - "+alexandre.getNome()+" e "+alexandre.getNome());
        if(alexandre.verificaIrmandade(alexandre))
            System.out.println("é irmão/irmã");
        else
            System.out.println("não é irmão/irmã");
        
        System.out.println("3.1 - Verifica antecessores: "+julia.getNome()+" e "+ines.getNome());
        if(julia.verificaAntecessor(ines))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
        System.out.println("3.2 - "+ricardo.getNome()+" e "+padrinho.getNome());
        if(ricardo.verificaAntecessor(padrinho))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
        System.out.println("3.3 - "+joao.getNome()+" e "+ernandes.getNome());
        if(joao.verificaAntecessor(ernandes))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
        System.out.println("3.4 - "+andrea.getNome()+" e "+ernandes.getNome());
        if(julia.verificaAntecessor(ernandes))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
        System.out.println("3.5 - "+ana.getNome()+" e "+andrea.getNome());
        if(ana.verificaAntecessor(andrea))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
        System.out.println("3.6 - "+maria.getNome()+" e "+sonia.getNome());
        if(maria.verificaAntecessor(sonia))
            System.out.println("é antecessor");
        else
            System.out.println("não é antecessor");
    }
}
