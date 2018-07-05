package br.com.caelum.banco.modelo;
import br.com.caelum.banco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel, Comparable {
    
	public int compareTo(Object o) {
		ContaCorrente cc = (ContaCorrente)o;
		return (int) (cc.getSaldo() - getSaldo());
	}
	
     public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
    
    
    
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }


	@Override
	public double cacularTributos() {
		return this.getSaldo() * 0.01;
	}
	
	@Override
    public String toString() {    	
    	return "Eu sou uma conta corrente";
    }
    
}