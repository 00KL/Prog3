package lab2;

//Fazer uma classe gerente que herda características da classe funcionário. 
//Essa classe deve ter uma listagem dos subordinados e cada departamento 
//deve ter um gerente

public class Gerente extends Funcionario {
	
	private java.util.LinkedList<Funcionario> subordinados;
	
	public Gerente(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	

}
