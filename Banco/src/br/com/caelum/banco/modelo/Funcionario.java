package br.com.caelum.banco.modelo;
public abstract class Funcionario {    
    private int matricula;
    private String nome;
    protected double salario;
    private String dataAdmissao;
    private String rg;
    private String departamento;
    
    
    public Funcionario(){        
    }
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public Funcionario(String nome, String dataAdminissao) {
        this.nome = nome;
        this.dataAdmissao = dataAdminissao;
    }
    
    public abstract double getBonificacao();
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setDataAdminissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public String getRg(){
        return rg;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }// TODO Auto-generated method stub
    
    public String getDepartamento(){
        return departamento;
    }
    
    
    void recebeAumento(double aumento) {
        salario += aumento;
    }
    
    void mostra() {
        System.out.println("Funcionario.: " + nome + "\n Salario.: " + salario);
    }
    
    double calculaGanhoAnual(){
        return salario * 12;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof Funcionario) {
			Funcionario f = (Funcionario)obj;
			return this.matricula == f.getMatricula();
		} else {
			return false;
		}
    	
    }
}