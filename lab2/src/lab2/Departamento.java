package lab2;
//Em seguida, crie uma classe que represente um departamento de uma empresa, 

//registrando o nome e os funcionários que nele trabalham.

public class Departamento {
	private String nome;
	private java.util.LinkedList<Funcionario> listaDFuncionarios;
	
	public Departamento(String nome) {
		this.nome = nome;
		this.listaDFuncionarios = new java.util.LinkedList<Funcionario>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public java.util.LinkedList<Funcionario> getListaDFuncionarios() {
		java.util.LinkedList<Funcionario> copia = new java.util.LinkedList<Funcionario>(listaDFuncionarios);
		return copia;
	}

	public void setFuncionario(Funcionario f) {
		this.listaDFuncionarios.add(f);
	}

}
