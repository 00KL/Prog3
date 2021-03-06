package lab2;
//c) Por fim, crie uma classe que representa uma empresa, registrando seu nome, CNPJ e departamentos.

public class Empresa {
	private String nome;
	private String cnpj;
	private java.util.LinkedList<Departamento> Departamentos;
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.Departamentos = new java.util.LinkedList<Departamento>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public java.util.LinkedList<Departamento> getDepartamentos() {
		java.util.LinkedList<Departamento> copia = new java.util.LinkedList<Departamento>(this.Departamentos);
		return copia;
	}
	public void setDepartamentos(Departamento d) {
		this.Departamentos.add(d);
	}
	
	public void transferenciaDFuncionarios(Departamento v, Departamento n, Funcionario f) {
		Funcionario troca = new Funcionario(f.getNome(), f.getSalario(), f.getAdmissao());
		n.setFuncionario(troca);
		
		v.retiraFuncionario(f);
	}
	
	
}