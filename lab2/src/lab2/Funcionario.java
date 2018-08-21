package lab2;
//Crie uma classe que representa um funcion�rio, registrando seu nome, sal�rio e data de admiss�o (use new java.util.Date()).

public class Funcionario {
	private String nome;
	private float salario;
	private java.util.Date admissao;
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
		this.admissao = new java.util.Date();
	}
	
	public Funcionario(String nome, float salario, java.util.Date d) {
		this.nome = nome;
		this.salario = salario;
		this.admissao = d;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public java.util.Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(java.util.Date admissao) {
		this.admissao = admissao;
	}
	
	
}