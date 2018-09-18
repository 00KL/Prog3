package q1;

// - Dado um departamento, quais são os seus funcionários?

public class UnidadeDeLotacao {
	private String nome;
	private java.util.LinkedList<Funcionario> funcionarios;
	
	public UnidadeDeLotacao(String nome) {
		this.nome = nome;
		this.funcionarios = new java.util.LinkedList<Funcionario>();
		
	}
	
	public java.util.LinkedList<Funcionario> getFuncionario() {
		return funcionarios;
	}
	public void setFuncionario(String nome, String cpf, float salario) {
		Funcionario f = new Funcionario(nome, cpf, salario, this);
		this.funcionarios.add(f);
	}
	public void print_Funcionarios() {
		for (Funcionario f:funcionarios) {
			System.out.println(f.getNome()); 
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
