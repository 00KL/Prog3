package q1;

/**
 * Questão 1.
 * 
 * Crie classes para representar os dados da estrutura organizacional 
 * de uma empresa. Use como referência o diagrama
 * de classes fornecido (os atributos e métodos foram 
 * omitidos propositalmente). 
 *
 * Note que um funcionário pode estar lotado diretamente em um 
 * departamento ou um sub-departamento.
 *
 * Inclua funcionalidade nas classes adequadas para responder às seguintes perguntas: 
 * - Dado um departamento, quais são os seus funcionários? 
 * - Dado um departamento, quais são os seus sub-departamentos? 
 * - Dado um funcionário, em que departamento ou sub-departamento ele está lotado?
 *
 * Implemente funcionalidade que permita dar um aumento em porcentagem a um
 * funcionário, a todos os funcionários de um departamento (incluindo os 
 * funcionários de subdepartamentos.
 * 
 * Crie um testador para estas suas classes.
 */

public class Empresa {
	
	private String nome;	
	private String cnpj;
	private java.util.LinkedList<Departamento> departamentos;
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.departamentos = new java.util.LinkedList<Departamento>();
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
	
	public java.util.LinkedList<Departamento> getDerpatamentos() {
		return departamentos;
	}
	public void setDerpatamentos(java.util.LinkedList<Departamento> derpatamentos) {
		departamentos = derpatamentos;
	}
	public Departamento addDepartamento(String nome) {
		Departamento d = new Departamento(nome);
		this.departamentos.add(d);
		return d;
	}


}
