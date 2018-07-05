public class Gerente extends Funcionario {
    private int senha = 123;
    
    public double getBonificacao(){
        return salario * 0.1 +1000;
    }
   
    public boolean testaSenha(int senha) {
        return this.senha == senha;
    }
}