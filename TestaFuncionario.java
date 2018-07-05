public class TestaFuncionario {
    public static void main (String args[]) {
        
        Funcionario f = new Funcionario();
        // manipulação de atributos
        
        f.setFuncionarioNome("Delcidio");
        f.setFuncionarioMatricula(123);
        f.setFuncionarioDepartamento("Recepção");
        f.setFuncionarioSalario(2000);
        
        // manipulando metodos
        f.mostra();
        f.recebeAumento(200);
        f.mostra();
        
        System.out.println(f.calculaGanhoAnual());
    }
}