package q1;

public class Funcionario {
	private String nome;
	private String cpf;
	private float salario;
	private UnidadeDeLotacao unidadeDeLotacao;
	
	
	public Funcionario(String nome, String cpf, float salario, UnidadeDeLotacao unidadeDeLotacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.unidadeDeLotacao = unidadeDeLotacao;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void aumentoF(float a) {
		this.salario = this.salario + (this.salario * ( a/100) );
	}

	
	public UnidadeDeLotacao getUnidadeDeLotacao() {
		return unidadeDeLotacao;
	}

	public void setUnidadeDeLotacao(UnidadeDeLotacao unidadeDeLotacao) {
		this.unidadeDeLotacao = unidadeDeLotacao;
	}
	
	
	
	
}
