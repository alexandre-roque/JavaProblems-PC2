package aplicacao;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import dominio.ContaBancariaModelo;

import apresentacao.ContaBancariaConsoleVisao;
import apresentacao.ContaBancariaVisao;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaBancariaModelo modelo = new ContaBancariaModelo(10000.00);
		ContaBancariaVisao visao = new ContaBancariaVisao(modelo);
		ContaBancariaConsoleVisao cv = new ContaBancariaConsoleVisao(modelo);
                visao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                visao.setSize(178, 95);
                visao.setVisible(true);
		
	}

}
