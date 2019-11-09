package br.com.fiap.conta.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteDaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaCorrente c3 = new ContaCorrente();
		ContaCorrente c4 = new ContaCorrente();
		
		System.out.println(c1.getTipo());
		System.out.println(c2.getTipo());		
		
		SeguroDeVida s1 = new SeguroDeVida();
		System.out.println(s1.getTipo());
		
		c3.setAgencia("Itau");
		c3.setNumero(130);
		c3.setTitular("Maria Doe");
		
		c4.setAgencia("Santander");
		c4.setNumero(140);
		c4.setTitular("Jonh Doe");
		//c3.deposita(10);
		//c3.saque(20);
		
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		

	}

}
