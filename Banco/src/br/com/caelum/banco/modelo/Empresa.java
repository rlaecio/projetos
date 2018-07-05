package br.com.caelum.banco.modelo;
class Empresa {
    String cnpj;
    String razaoSocial;
    Funcionario[] empregados;
    
    void adicionarFuncionario(Funcionario f) {
        for(int i=0; i < empregados.length; i++){
            if(empregados[i]==null){
                empregados[i] = f;
                break;
            }    
        }
        
    }
    
    void mostrarEmpregados() {
        for(Funcionario f : empregados){
            if(f!=null) f.mostra();
        }
        
    }
    
    
}