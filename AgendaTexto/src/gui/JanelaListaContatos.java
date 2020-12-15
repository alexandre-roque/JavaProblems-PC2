package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import principal.Agenda;
//import principal.Contato;

public class JanelaListaContatos extends JFrame{
    
    private String[] contatos;
    private JList jlista;
    
    private JPanel infoGeral;
    
    private JLabel infoTelefone;
    private JLabel infoEndereco;
    private JLabel infoEmail;
    
    private Agenda agendaAux; // Agenda auxiliar igual à da janela principal
    
    public JanelaListaContatos(Agenda agenda){ // No construtor recebemos a agenda vigente 
        this.agendaAux = agenda;
        
        this.setTitle("Lista de Contatos");
        this.setSize(335, 210);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        instanciaComponentes();
        defineLayoutPanels();
        adicionaComponentes();
        registraHandler();
    }
    
    public void instanciaComponentes(){
        this.contatos = agendaAux.listaContatos();
        jlista = new JList(contatos);
        
        infoGeral = new JPanel();
        
        infoTelefone = new JLabel("Telefone");
        infoEndereco = new JLabel("Endereço");
        infoEmail = new JLabel("Email");
    }
    
    public void defineLayoutPanels(){
        infoGeral.setLayout(new GridLayout(4, 2));
        
        infoTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        infoEndereco.setHorizontalAlignment(SwingConstants.CENTER);
        infoEmail.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    public void adicionaComponentes(){
        this.add(BorderLayout.WEST,jlista);
        this.add(BorderLayout.CENTER, infoGeral);
        
        infoGeral.add(infoTelefone);
        infoGeral.add(infoEndereco);
        infoGeral.add(infoEmail);
    }
    
    
    public void registraHandler(){
        jlista.addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent e){
                int index = jlista.getSelectedIndex();
                String nomeContato = contatos[index];
                
                Set<String> chaves = agendaAux.getAgenda().keySet();
                for(String chave: chaves){
                    if(nomeContato.equals(agendaAux.getAgenda().get(chave).getNome())){
                        infoTelefone.setText(agendaAux.getAgenda().get(chave).getTelefone()); 
                        infoEndereco.setText(agendaAux.getAgenda().get(chave).getEndereco());        
                        infoEmail.setText(agendaAux.getAgenda().get(chave).getEmail());
                    }
                }     
            }
        });
    }
    
    
}
