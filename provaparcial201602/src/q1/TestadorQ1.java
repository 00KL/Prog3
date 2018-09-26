package q1;

/**
 * Questão 1.
 * 
 * Crie classes para representar os dados da estrutura organizacional de uma empresa. Use como referência o diagrama
 * de classes fornecido (os atributos e métodos foram omitidos propositalmente). 
 *
 * Note que um funcionário pode estar lotado diretamente em um departamento ou um
 * sub-departamento.
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

public class TestadorQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria empresa
		Empresa e = new Empresa("testador", "150-45");
		
		//Cria departamento
		Departamento d = e.addDepartamento("dev");
		
		//Preenche departamento com funcionarios
		d.setFuncionario("Lucas", "345-10", 10000);
		d.setFuncionario("Luciano", "345-10", 10000);
		d.setFuncionario("Carlos", "345-10", 10000);
		d.setFuncionario("Cezar", "345-10", 10000);
		
		//Lista funcionarios
		java.util.LinkedList<Funcionario> f = d.getFuncionario();
		for (Funcionario funcionario : f) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getUnidadeDeLotacao().getNome());
		}
		
		//Preenche subDepartamento
		d.addSubDepartamento("dev_games");
		d.addSubDepartamento("dev_interface");
		d.addSubDepartamento("dev_hub");
		
		//Lista subDepartamentos
		java.util.LinkedList<SubDepartamento> imprime = d.getSubDepartamentos();
		for (SubDepartamento subDepartamento : imprime) {
			System.out.println(subDepartamento.getNome());
		}
		
		//Aumento para um departamento e seus subDepartamentos
		for (Funcionario func : f) {
			System.out.printf("Salario: %.0f\n", func.getSalario());
		}
		System.out.printf("\n\n\n");
		d.aumento(5);
		for (Funcionario func : f) {
			System.out.printf("Salario: %.0f\n", func.getSalario());
		}

	}

}


// http://yuml.me/edit/385104f0
