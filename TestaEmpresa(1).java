class TestaEmpresa {
    public static void main (String args[]) {
        Funcionario f1 = new Funcionario();
        f1.funcionarioNome = "Aragão";
        f1.funcionarioSalario = 2000;
        
        Funcionario f2 = new Funcionario();
        f2.funcionarioNome = "Peçanha";
        f2.funcionarioSalario = 1000;
        
        Empresa e = new Empresa();
        e.razaoSocial = "Caelum";
        e.empregados = new Funcionario[10];
        e.adicionarFuncionario(f1);
        e.adicionarFuncionario(f2);
        e.mostrarEmpregados();
    }
    
}

