class Funcionario {    
    private int funcionarioMatricula;
    private String funcionarioNome;
    private double funcionarioSalario;
    private String funcionarioDataAdmissao;
    private String funcionarioRg;
    private String funcionarioDepartamento;
    
    public Funcionario(){        
    }
    
    public Funcionario(String nome){
        funcionarioNome = nome;
    }
    
    public Funcionario(String nome, String dataAdminissao) {
        funcionarioNome = nome;
        funcionarioDataAdmissao = dataAdminissao;
    }
    
    public void setFuncionarioMatricula(int funcionarioMatricula){
        this.funcionarioMatricula = funcionarioMatricula;
    }
    
    public int getFuncionarioMatricula(){
        return funcionarioMatricula;
    }
    
    public void setFuncionarioNome(String funcionarioNome){
        this.funcionarioNome = funcionarioNome;
    }
    
    public String getFuncionarioNome(){
        return funcionarioNome;
    }
    
    public void setFuncionarioSalario(double funcionarioSalario){
        this.funcionarioSalario = funcionarioSalario;
    }
    
    public double getFuncionarioSalario(){
        return funcionarioSalario;
    }
    
    public void setFuncionarioDataAdminissao(String funcionarioDataAdmissao){
        this.funcionarioDataAdmissao = funcionarioDataAdmissao;
    }
    
    public void setFuncionarioRg(String funcionarioRg){
        this.funcionarioRg = funcionarioRg;
    }
    
    public String getFuncionarioRg(){
        return funcionarioRg;
    }
    
    public void setFuncionarioDepartamento(String funcionarioDepartamento){
        this.funcionarioDepartamento = funcionarioDepartamento;
    }
    
    public String getFuncionarioDepartamento(){
        return funcionarioDepartamento;
    }
    
    
    void recebeAumento(double aumento) {
        funcionarioSalario += aumento;
    }
    
    void mostra() {
        System.out.println("Funcionario.: " + funcionarioNome + "\n Salario.: " + funcionarioSalario);
    }
    
    double calculaGanhoAnual(){
        return funcionarioSalario * 12;
    }
}