package br.com.fiap.conta.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);

			contas[i] = conta;
		}

		double valor = 0;

		for (int i = 0; i < contas.length; i++) {

			valor += contas[i].getSaldo();

		}

		System.out.println("A media de deposito é: " + (valor / contas.length));

	}

}
