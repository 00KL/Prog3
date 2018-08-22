package lab2;

//d) Faça um programa que:
//* Crie uma empresa; X
//* Adicione a esta empresa alguns departamentos; X
//* Adicione aos departamentos alguns funcionários; X
//* Dê aumento de 10% a todos os funcionários de um determinado departamento; X
//* Transfira um funcionário de um departamento para outro. X

//Fazer uma classe gerente que herda características da classe funcionário. 
//Essa classe deve ter uma listagem dos subordinados e cada departamento 
//deve ter um gerente X

public class Testador {
	public static void main(String args[]) {
		//* Crie uma empresa; X
		Empresa e = new Empresa("LeL", "57.432.426/0001-31"); 
		
		//* Adicione a esta empresa alguns departamentos; X
		Departamento n = new Departamento("novo");
		Departamento v = new Departamento("velho");
		
		e.setDepartamentos(n);
		e.setDepartamentos(v);
		
		//* Adicione aos departamentos alguns funcionários; X
		Funcionario a = new Funcionario("Ana", 3000);
		Funcionario b = new Funcionario("Carla", 4900);
		Funcionario c = new Funcionario("Camacho", 2400);
		Funcionario d = new Funcionario("Lucius", 2556);
		
		n.setFuncionario(a);
		n.setFuncionario(b);
		v.setFuncionario(c);
		v.setFuncionario(d);
		
		//* Dê aumento de 10% a todos os funcionários de um determinado departamento; X
		n.alteraSalarioGeral(10);
		
		n.nomesFuncionarios();
		v.nomesFuncionarios();
		//* Transfira um funcionário de um departamento para outro. X
		e.transferenciaDFuncionarios(v, n, c);
		n.nomesFuncionarios();
		v.nomesFuncionarios();
		
		System.out.printf("\n\n\n");
		
		//Fazer uma classe gerente que herda características da classe funcionário. 
		//Essa classe deve ter uma listagem dos subordinados e cada departamento 
		//deve ter um gerente X
		n.setGerente(a);
		v.setGerente(d);
		
		
	}
	
	
	
}