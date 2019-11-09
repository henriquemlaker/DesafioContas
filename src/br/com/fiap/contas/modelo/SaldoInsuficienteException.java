package br.com.fiap.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente paar sacar o valor de: "+ valor);
	}
}
