package dominio;

import java.util.ArrayList;
import java.util.Iterator;

import apresentacao.Observador;



public class ContaBancariaModelo {
	// dados privados
	private double saldo;
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	
	public ContaBancariaModelo(double depositoInicial){
		setSaldo(depositoInicial);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		notifyObservers();
	}
	
	public double sacarFundos(double valorASacar){
		if (valorASacar>getSaldo()){
			valorASacar = getSaldo();
		}
		setSaldo(getSaldo()-valorASacar);
		return valorASacar;
	}
	
	public void depositaFundos(double valorADepositar){
		setSaldo(getSaldo()+valorADepositar);
	}
	///////////////////////////////////////////////////////////////////
	public void addObservadores(Observador observador){
		observadores.add(observador);
		notifyObservers();
	}
	///////////////////////////////////////////////////////////////////	
	public void removeObservadores(Observador observador){
		observadores.remove(observador);
	}
	///////////////////////////////////////////////////////////////////	
	public void notifyObservers(){
		Iterator<Observador> it = observadores.iterator();
		while(it.hasNext()){
			Observador observador = it.next();
			observador.update(this);
		}
	}
	///////////////////////////////////////////////////////////////////

}
