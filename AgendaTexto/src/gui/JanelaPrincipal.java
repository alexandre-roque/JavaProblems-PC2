package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import principal.Agenda;
import principal.Contato;
import textFileApps.CreateTextFile;
import textFileApps.ReadTextFile;

public class JanelaPrincipal extends JFrame
        implements ActionListener {

    private JPanel panelLabels;
    private JPanel panelTexts;
    private JPanel panelBotoes;
    private JPanel panelBanner;

    private JLabel banner;
    private JLabel lnome;
    private JLabel lendereco;
    private JLabel ltelefone;
    private JLabel lemail;

    private JTextField nome;
    private JTextField endereco;
    private JTextField telefone;
    private JTextField email;

    private JButton botaoLimpar;
    private JButton botaoInserir;
    private JButton botaoConsultar;
    private JButton botaoGravar;
    private JButton botaoListar;
    private JButton botaoApagar;

    private Agenda agenda;
    private Contato contato;

    public JanelaPrincipal() {
        super("Agenda de contatos");
        instanciaComponentes();
        inicializaContatos();
        defineLayoutPanels();
        adicionaComponentes();
        registraHandler();
    }

    public void instanciaComponentes() {
        agenda = new Agenda();

        panelLabels = new JPanel();
        panelTexts = new JPanel();
        panelBotoes = new JPanel();
        panelBanner = new JPanel();

        banner = new JLabel("Agenda");

        nome = new JTextField();
        endereco = new JTextField();
        telefone = new JTextField();
        email = new JTextField();

        lnome = new JLabel("Nome :");
        lendereco = new JLabel("Endereço: ");
        ltelefone = new JLabel("Telefone: ");
        lemail = new JLabel("Email: ");

        botaoLimpar = new JButton(" Limpar ");
        botaoInserir = new JButton(" Inserir ");
        botaoConsultar = new JButton(" Consultar ");
        botaoGravar = new JButton(" Gravar ");
        botaoListar = new JButton(" Listar ");
        botaoApagar = new JButton(" Apagar ");
    }

    public void defineLayoutPanels() {
        setLayout(new BorderLayout());

        panelLabels.setLayout(new GridLayout(4, 2));
        panelTexts.setLayout(new GridLayout(4, 2));
        panelBotoes.setLayout(new GridLayout(2, 3));

        //define alinhamento dos labels
        lnome.setHorizontalAlignment(SwingConstants.RIGHT);
        lendereco.setHorizontalAlignment(SwingConstants.RIGHT);
        ltelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        lemail.setHorizontalAlignment(SwingConstants.RIGHT);

    }

    public void adicionaComponentes() {
        add(panelLabels, BorderLayout.WEST);
        add(panelTexts, BorderLayout.CENTER);
        add(panelBotoes, BorderLayout.SOUTH);
        add(panelBanner, BorderLayout.NORTH);

        panelBanner.add(banner);

        panelLabels.add(lnome);
        panelLabels.add(lendereco);
        panelLabels.add(ltelefone);
        panelLabels.add(lemail);

        panelTexts.add(nome);
        panelTexts.add(endereco);
        panelTexts.add(telefone);
        panelTexts.add(email);

        panelBotoes.add(botaoLimpar);
        panelBotoes.add(botaoInserir);
        panelBotoes.add(botaoConsultar);
        panelBotoes.add(botaoGravar);
        panelBotoes.add(botaoListar);
        panelBotoes.add(botaoApagar);
    }

    public void registraHandler() {
        botaoLimpar.addActionListener(this);
        botaoInserir.addActionListener(this);
        botaoConsultar.addActionListener(this);
        botaoGravar.addActionListener(this);
        botaoListar.addActionListener(this);
        botaoApagar.addActionListener(this);
    }
    
    public void inicializaContatos(){ // Metódo feito para inicializar os contatos dentro do arquivo
        ReadTextFile.openFile();
        HashMap<String, Contato> hashAux = ReadTextFile.readRecords();
        agenda.setAgenda(hashAux);
    }

    public static void main(String[] args) {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setSize(450, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals(" Inserir ")) {
            contato = new Contato(nome.getText(), endereco.getText(), telefone.getText(), email.getText());
            if (agenda.inserirContato(contato)) {
                JOptionPane.showMessageDialog(this, "Contato incluido com sucesso!", "Inclusão", JOptionPane.INFORMATION_MESSAGE);
                limparTela();
                CreateTextFile.openFile();
                agenda.gravar();
                CreateTextFile.closeFile();
            }
            else{
                JOptionPane.showMessageDialog(this, "Faltam dados para a inclusão!", "Inclusão", JOptionPane.INFORMATION_MESSAGE);
                //limparTela();
            }
        }
        if (((JButton) e.getSource()).getText().equals(" Consultar ")) {
            Contato c = agenda.pesquisar(nome.getText());
            if(c.getNome().equals("")){
                JOptionPane.showMessageDialog(this, "Contato não encontrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                nome.setText(c.getNome());
                endereco.setText(c.getEndereco());
                telefone.setText(c.getTelefone());
                email.setText(c.getEmail());
            }
        }
        if (((JButton) e.getSource()).getText().equals(" Limpar ")) {
            limparTela();
        }
        if (((JButton) e.getSource()).getText().equals(" Gravar ")) {
            CreateTextFile.openFile();
            contato = new Contato(nome.getText(), endereco.getText(), telefone.getText(), email.getText());
            agenda.gravar();
            limparTela();
            CreateTextFile.closeFile();
        }
        if (((JButton) e.getSource()).getText().equals(" Listar ")) {
           JanelaListaContatos lista = new JanelaListaContatos(agenda);
        }
        if (((JButton) e.getSource()).getText().equals(" Apagar ")) {
            Contato c = agenda.pesquisar(nome.getText());
            int input = JOptionPane.showConfirmDialog(null, "Deseja apagar esse contato?: "+c.getNome());
            if(input == 0){
                agenda.apagarContato(c);
                JOptionPane.showMessageDialog(this, "Contato excluído!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                limparTela();
            }
            if(input == 2){
                limparTela();
            }
        }
    }

    public void limparTela() {
        nome.setText("");
        endereco.setText("");
        telefone.setText("");
        email.setText("");
    }

}
