package br.com.caelum.banco.modelo;

import br.com.caelum.banco.util.ValorInvalidoException;
/**
 * 
 * @author Roque Laecio
 * 
 *
 */
public abstract class Conta {

    private static int numero;
    private String titular;
    protected double saldo;
    private double limite;
    
    public Conta(){
        limite = 500;
        numero ++;
    }
    
    public Conta(String titular){
        this.titular = titular;
        numero ++;
    }
    
    public void setNumero(int numero){
    	this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite(){
        return limite;
    }
    
    
    public static int getQuantidadeConta(){
        return numero;
    }
    
    public abstract  void atualiza(double taxa);
    
    void mostra() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Numero: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
    
    
    /* 
     * metodo para saques da conta atual
     */
    boolean sacar(double valor) {
        if(saldo + limite > valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }        
    }
    
    
    /*
     * metodo para deposito em conta
     */
    public void deposita(double valor)  throws ValorInvalidoException {
    	if (valor < 0 ) {
			throw new ValorInvalidoException("VOCÊ TENTOU DEPOSITAR UM VALOR INVÁLIDO");
		} else {
			this.saldo += valor;
		}
        
    }  
    
    
    /*
     * metodo para transferencia entre contas
     */
    void transferenciaPara(Conta destino, double valor) {
        if(sacar(valor)) {
            destino.deposita(valor);
        }   
    }
    
    @Override
    public String toString() {    	
    	return "Eu sou uma conta";
    }
} 