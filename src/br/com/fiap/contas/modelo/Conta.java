package br.com.fiap.contas.modelo;

public abstract class Conta {

	private String titular;
	private String agencia;
	private int numero;
	protected double saldo;

	public abstract double getSaldo();

	public String getTitular() {
		return titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return "[titular=" + titular + ",numero=" + numero + ",agencia=" + agencia + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	abstract void saque(double valor);

	public void transfere(double valor, Conta conta) {
		this.saque(valor);
		conta.deposita(valor);
	}

}
