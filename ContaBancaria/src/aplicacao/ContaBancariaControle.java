package aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.ContaBancariaVisao;

import dominio.ContaBancariaModelo;


public class ContaBancariaControle implements ActionListener {
	private ContaBancariaVisao visao;
	private ContaBancariaModelo modelo;

	public ContaBancariaControle(ContaBancariaVisao visao,ContaBancariaModelo modelo) {
		this.visao = visao;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		double valor = visao.getSaldo();
		if (comando.equals(visao.SAQUE)){
			modelo.sacarFundos(valor);
		}
		else{
			if (comando.equals(visao.DEPOSITO)){
				modelo.depositaFundos(valor);
			}
		}
		
	}
	
}
