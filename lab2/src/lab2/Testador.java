package lab2;

//d) Faça um programa que:
//* Crie uma empresa; X
//* Adicione a esta empresa alguns departamentos; X
//* Adicione aos departamentos alguns funcionários; X
//* Dê aumento de 10% a todos os funcionários de um determinado departamento;
//* Transfira um funcionário de um departamento para outro.

public class Testador {
	public static void main(String args[]) {
		Empresa e = new Empresa("LeL", "57.432.426/0001-31"); 
		
		Departamento n = new Departamento("novo");
		Departamento v = new Departamento("velho");
		
		Funcionario a = new Funcionario("Ana", 3000);
		Funcionario b = new Funcionario("Carla", 4900);
		Funcionario c = new Funcionario("Camacho", 2400);
		Funcionario d = new Funcionario("Lucius", 2556);
		
		e.setDepartamentos(n);
		e.setDepartamentos(v);
		
		n.setFuncionario(a);
		n.setFuncionario(b);
		v.setFuncionario(c);
		v.setFuncionario(d);
		
		
	}
	
	
	
}
