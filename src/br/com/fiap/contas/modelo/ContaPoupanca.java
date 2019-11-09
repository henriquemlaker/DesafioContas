package br.com.fiap.contas.modelo;

public class ContaPoupanca extends Conta{	
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Conta Poupança";
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void saque(double valor) {
		// TODO Auto-generated method stub
		
	}

}