package br.com.caelum.banco;
import br.com.caelum.banco.modelo.ContaCorrente;

public class TestaTributavel  {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.cacularTributos());
		
		// testando o polimorfismo		
		Tributavel t = cc;
		System.out.println(t.cacularTributos());
	}

}
