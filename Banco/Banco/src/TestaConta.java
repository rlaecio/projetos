
public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
	
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());	
	}

}
