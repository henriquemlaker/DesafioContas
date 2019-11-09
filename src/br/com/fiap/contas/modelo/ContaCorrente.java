package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
    
	@Override
	public void saque(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		}
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		}else {
			this.saldo += valor;
		}
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}

}