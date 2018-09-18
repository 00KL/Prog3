package q1;

public class SubDepartamento extends UnidadeDeLotacao {
	private Departamento departamento;
	
	public SubDepartamento(String nome, Departamento d) {
		super(nome);
		this.departamento = d;
		// TODO Auto-generated constructor stub
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	

}
