public class Conta {

    private static int numero;
    private String titular;
    private double saldo;
    private double limite;
    
    public Conta(){
        limite = 500;
        this.numero ++;
    }
    
    public Conta(String titular){
        this.titular = titular;
        this.numero ++;
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
    
    void mostra() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Numero: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
    
    
    // metodo para saques da conta atual
    boolean sacar(double valor) {
        if(saldo + limite > valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }        
    }
    
    // metodo para deposito em conta
    void deposita(double valor) {
        saldo += valor;
    }  
    
    
    //metodo para transferencia entre contas
    void transferenciaPara(Conta destino, double valor) {
        if(sacar(valor)) {
            destino.deposita(valor);
        }   
    }
} 