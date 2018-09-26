package q3;

public class Agencia {
	private String nome;
	private double saldoMedio;
	private java.util.LinkedList<Conta> contas;
	

	@Override
	public String toString() {
		this.saldoMedio();
		return "\nAgência: " + nome + ", saldo médio: " + saldoMedio ;
	}

	Agencia(String nome){
		this.nome = nome;
		this.contas = new java.util.LinkedList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public java.util.LinkedList<Conta> getContas() {
		return contas;
	}

	public void setContas(java.util.LinkedList<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void saldoMedio() {
		double media = 0;
		for (Conta conta : contas) {
			media += conta.getSaldoInicial();
		}
		
		media = media/(contas.size());
		this.saldoMedio = media;
	}
	
}
