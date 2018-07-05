package br.com.caelum.banco.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		cc1.deposita(10000);
		ContaCorrente cc2 = new ContaCorrente();
		cc2.deposita(5000);
		ContaCorrente cc3 = new ContaCorrente();
		cc3.deposita(3000);
		
		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		Collections.sort(contas);
		for (int i = 0; i < contas.size(); i++) {
			contas.get(i).mostra();
		}
	}

}
