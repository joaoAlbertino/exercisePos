package br.inatel.dm112.conta.model;

import br.inatel.dm112.conta.interfaces.Atualizacao;

public abstract class Conta implements Atualizacao{

	private int numero ;
	private String cliente;
	private float saldo = 0f;
	
	public void conta (int numero , String cliente) {
		
	}
	
	public void sacar(float valor) {
		
	}
	
	public boolean depositar (float valor) {
		
		return false;
	}
	
	public void tranferir(Conta conta, float valor) {
		
	}
	
	public float getSaldo() {		
		return this.saldo;
	}
	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
