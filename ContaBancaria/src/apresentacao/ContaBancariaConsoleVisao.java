package apresentacao;


import dominio.ContaBancariaModelo;


public class ContaBancariaConsoleVisao implements Observador {
	private ContaBancariaModelo modelo;
	
	public ContaBancariaConsoleVisao(ContaBancariaModelo modelo){
		this.modelo = modelo;
		this.modelo.addObservadores(this);
	}


	public void update(ContaBancariaModelo arg01) {
		System.out.println("Saldo atual : $"+modelo.getSaldo());
		
	}

}
