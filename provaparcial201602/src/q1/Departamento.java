package q1;

class Departamento extends UnidadeDeLotacao {
	private java.util.LinkedList<SubDepartamento> subDepartamentos;
	
	public Departamento(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public java.util.LinkedList<SubDepartamento> getSubDepartamentos() {
		return subDepartamentos;
	}

	public void setSubDepartamentos(java.util.LinkedList<SubDepartamento> subDepartamentos) {
		this.subDepartamentos = subDepartamentos;
	}
	public SubDepartamento addSubDepartamento(String s) {
		SubDepartamento sub = new SubDepartamento(s, this);
		this.subDepartamentos.add(sub);
		
		return sub;
	}
	public printaSubDepartamentos() {
		for(subDepartamento s: subDepartamentos) {
			
		}
	}
	
	
}
	
	
	
	
