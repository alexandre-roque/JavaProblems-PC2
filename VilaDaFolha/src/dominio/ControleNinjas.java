/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Ninja;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import textFileApp.ConfereInformacao;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class ControleNinjas extends Observable{
    
    
    public ArrayList<Ninja> ninjas;
    
    public ControleNinjas(){
        
        this.ninjas = new ArrayList<>();
        lerDadosNinja();
    }
    
    
    public boolean adicionaNinja(String nome,String idadeNinja,String rank,String meritoNinja){
            int idade = 0;
            double merito = 0;
            
            if(ConfereInformacao.isNumeric(idadeNinja)){
                idade = Integer.parseInt(idadeNinja);
            }else{
                return false;
            }
            
            if(ConfereInformacao.isNumeric(meritoNinja)){
                merito = Double.parseDouble(meritoNinja);
            }else
                return false;
            
            if(ConfereInformacao.temConteudo(rank) && ConfereInformacao.temConteudo(nome)){
                Ninja ninjaAdicionado = new Ninja(nome,idade,rank,merito,"");
                this.ninjas.add(ninjaAdicionado);
                cadastrarDadosNinja();
                mudaEstado();
                return true;
            }
            
            return false;
    }
    
    public void lerDadosNinja(){
        
        ReadTextFile.openFile("listaNinjas.txt");
        this.ninjas = ReadTextFile.readRecordsNinjas();
        ReadTextFile.closeFile();
    }
    
    public void cadastrarDadosNinja(){
         
        CreateTextFile.openFile("listaNinjas.txt");
        for(Ninja ninjas : this.ninjas){
            
            CreateTextFile.cadastraNinja(ninjas);
        }
        CreateTextFile.closeFile();  
    }
    
    public String[] consultarNinja(String nomeNinja){
        
        String [] campos = new String [4];
        
        for(Ninja ninja : this.ninjas){
            
            if(ninja.getNome().startsWith(nomeNinja)){
                campos[0] = ninja.getNome();
                campos[1] = String.valueOf(ninja.getIdade());
                campos[2] = ninja.getRank();
                campos[3] = String.valueOf(ninja.getMerito());
                return campos;
            }
            
            if(ninja.getNome().equals(nomeNinja)){
                campos[0] = ninja.getNome();
                campos[0] = String.valueOf(ninja.getIdade());
                campos[1] = ninja.getRank();
                campos[2] = String.valueOf(ninja.getMerito());
                return campos;
            }
        
        }
        return null;
    }
    
    public boolean removerNinja(String nomeNinja){
        
        for(Ninja ninja : this.ninjas){
            
            if(nomeNinja.equals(ninja.getNome())){
                
                this.ninjas.remove(ninja);
                cadastrarDadosNinja();
                //System.out.println("Passou do remover");
                mudaEstado();
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean editarNinja(String[] campos){
        
        if(ConfereInformacao.isNumeric(campos[1]) && ConfereInformacao.temConteudo(campos[2]) && ConfereInformacao.isNumeric(campos[3])){
            for(Ninja ninja : this.ninjas){
                if(campos[0].equals(ninja.getNome())){
                   ninja.setIdade(Integer.parseInt(campos[1]));
                   ninja.setRank(campos[2]);
                   ninja.setMerito(Double.parseDouble(campos[3]));
                   cadastrarDadosNinja();
                   return true;
                } 
            }
        }
        return false;
    }
    
    public void adicionaMerito(Ninja ninja, double quantidade){
        ninja.setMerito(ninja.getMerito()+ quantidade );
        cadastrarDadosNinja();
        mudaEstado();
        //return true;
    }

    public ArrayList<Ninja> getNinjas() {
        return ninjas;
    }
    
    public void mudaEstado(){
        setChanged();
        notifyObservers(this.getNinjas());
        System.out.println(this.countObservers());
        //System.out.println("Mudou");
    }
    
}
