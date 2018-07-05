public class Filme {
	private int codigo;
	private String categoria;
	private String nome;
	private String diretor;
	private String sinopse;
	private int ano;
	private char classificacao;
	private String[] atores;
	
	
	public Filme() {
		
	}
	
	public Filme(int codigo, String categoria, String nome, String diretor,
			String sinopse, int ano, char classificacao, String[] atores) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.nome = nome;
		this.diretor = diretor;
		this.sinopse = sinopse;
		this.ano = ano;
		this.classificacao = classificacao;
		this.atores = atores;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public char getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(char classificacao) {
		this.classificacao = classificacao;
	}
	public String[] getAtores() {
		return atores;
	}
	public void setAtores(String[] atores) {
		this.atores = atores;
	}

	public void mostra() {		
		System.out.println("Codigo....: "+codigo);
		System.out.println("Categoria.: "+categoria);
		System.out.println("Nome......: "+nome);
		System.out.println("Diretor...: "+diretor);
		System.out.println("Sinopse...: "+sinopse);
		System.out.println("Sinopse...: "+ano);
	}
	
	
}
