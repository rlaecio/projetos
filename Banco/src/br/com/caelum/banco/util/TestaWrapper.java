package br.com.caelum.banco.util;

import br.com.caelum.banco.modelo.ContaCorrente;

public class TestaWrapper {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Integer.parseInt("325");
		
		System.out.println(new ContaCorrente());
		String a = "Caelum";
		a = a.toUpperCase();
		System.out.println(a);
	}

	
}
