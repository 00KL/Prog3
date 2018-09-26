package q3;

public class Banco {
	private String nome;
	private java.util.LinkedList<Agencia> agencias;
	
	Banco(String nome){
		this.nome = nome;
		this.agencias = new java.util.LinkedList<Agencia> ();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public java.util.LinkedList<Agencia> getAgencias() {
		java.util.LinkedList<Agencia> a = new java.util.LinkedList<>(agencias);
		return a;
	}
	public void setAgencias(Agencia agencias) {
		this.agencias.add(agencias);
	}
	
	public Agencia criaAgencia(String nome) {
		Agencia a = new Agencia(nome);
		this.setAgencias(a);
		return a;
	}

	@Override
	public String toString() {
		return "Nome do Banco:" + nome + printAgencias();
	}
	
	public String printAgencias() {
		String dadosAgencias = "";
		for (Agencia agencia : agencias) {
			dadosAgencias += agencia.toString();
		}
		
		return dadosAgencias;
	}
	
	
	
}
