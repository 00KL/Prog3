package lab2;

//d) Fa�a um programa que:
//* Crie uma empresa; X
//* Adicione a esta empresa alguns departamentos; X
//* Adicione aos departamentos alguns funcion�rios; X
//* D� aumento de 10% a todos os funcion�rios de um determinado departamento; X
//* Transfira um funcion�rio de um departamento para outro. 

public class Testador {
	public static void main(String args[]) {
		//* Crie uma empresa; X
		Empresa e = new Empresa("LeL", "57.432.426/0001-31"); 
		
		//* Adicione a esta empresa alguns departamentos; X
		Departamento n = new Departamento("novo");
		Departamento v = new Departamento("velho");
		
		e.setDepartamentos(n);
		e.setDepartamentos(v);
		
		//* Adicione aos departamentos alguns funcion�rios; X
		Funcionario a = new Funcionario("Ana", 3000);
		Funcionario b = new Funcionario("Carla", 4900);
		Funcionario c = new Funcionario("Camacho", 2400);
		Funcionario d = new Funcionario("Lucius", 2556);
		
		n.setFuncionario(a);
		n.setFuncionario(b);
		v.setFuncionario(c);
		v.setFuncionario(d);
		
		//* D� aumento de 10% a todos os funcion�rios de um determinado departamento; X
		n.alteraSalarioGeral(10);
		
		n.nomesFuncionarios();
		v.nomesFuncionarios();
		//* Transfira um funcion�rio de um departamento para outro. X
		e.transferenciaDFuncionarios(v, n, c);
		n.nomesFuncionarios();
		v.nomesFuncionarios();
	}
	
	
	
}