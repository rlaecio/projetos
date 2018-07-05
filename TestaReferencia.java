class TestaReferencia {
    public static void main (String args[]) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        f1.funcionarioNome = "Adamastor";
        f2.funcionarioNome = "Adamastor";
        f1.funcionarioMatricula = 5;
        f2.funcionarioMatricula = 5;
        
        if(f1.funcionarioMatricula == f2.funcionarioMatricula) {
            System.out.println("Iguais");
        } else {
            System.out.println("diferente");
        }
        
        System.out.println(f2);
        System.out.println(f1);
    }
    
}