package apresentacao;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.ContaBancariaModelo;

import aplicacao.ContaBancariaControle;
import javax.swing.JFrame;



public class ContaBancariaVisao extends JFrame implements Observador{
	
	public final static String DEPOSITO = "Deposito";
	public final static String SAQUE = "Saque";
	
	private ContaBancariaModelo modelo;
	private ContaBancariaControle controle;
	
	// Elementos da GUI, aloca tudo previamente para evitar valores nulos
	private JButton botaoDeposito = new JButton(DEPOSITO);
	private JButton botaoSaque = new JButton(SAQUE);
	private JTextField campoValorASacar = new JTextField();
	private JLabel nomeSaldoDisponivel = new JLabel();
	
	public ContaBancariaVisao(ContaBancariaModelo modelo){
		this.modelo = modelo;
		this.modelo.addObservadores(this);
		anexaControlador(criaControlador());
		constroiUI();
	}
	
	// chamado pelo modelo quando este muda

        @Override
	public void update(ContaBancariaModelo arg0) {
		nomeSaldoDisponivel.setText("Saldo: "+ modelo.getSaldo());	
	}
	
	// da acesso ao valor introduzido no campo
	public double getSaldo(){
		// supoe que o usuario introduziu um numero valido
		return Double.parseDouble(campoValorASacar.getText());
	}
	
	/*
	 * Insere o controlador dado no modo de visualizacao, permite que um objeto externo configure o controlador
	 */
	public void anexaControlador(ContaBancariaControle controle){
		// cada modo de visualizacao so pode ter um controlador; portanto, remove o antigo primeiro
		if (this.controle != null){
			botaoDeposito.removeActionListener((ActionListener) controle);
			botaoSaque.removeActionListener((ActionListener) controle);
		}
		this.controle = controle;
		botaoDeposito.addActionListener((ActionListener) controle);
		botaoSaque.addActionListener((ActionListener) controle);
	}
	
	public ContaBancariaControle criaControlador(){
		return new ContaBancariaControle(this, modelo);
	}
	
	private void constroiUI(){
		setLayout(new BorderLayout());
		//associa cada botao a uma string encomendada
		//o controlador usara essa string para interpretar eventos
		botaoDeposito.setActionCommand(DEPOSITO);
		botaoSaque.setActionCommand(SAQUE);
		
		//constroi a tela
		JPanel botoes = new JPanel(new BorderLayout());
		JPanel saldo = new JPanel(new BorderLayout());
		botoes.add(botaoDeposito, BorderLayout.WEST);
		botoes.add(botaoSaque, BorderLayout.EAST);
		botoes.add(nomeSaldoDisponivel, BorderLayout.NORTH);
		botoes.add(campoValorASacar, BorderLayout.SOUTH);
		add(saldo, BorderLayout.NORTH);
		add(botoes,BorderLayout.SOUTH);
		
		
	}
	
	

}
