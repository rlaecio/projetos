public class TestaConstrutor {
    public static void main (String args[]) {
        Conta contaComLimite = new Conta();
        contaComLimite.mostra();
        Conta contaComTitular = new Conta("Maluf");
        contaComTitular.mostra();
        
        Conta contaComNumero = new Conta();        
        System.out.println(Conta.getQuantidadeConta());
    }
    
}