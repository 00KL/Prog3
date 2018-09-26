package q3;

public class Conta {
	private String nomeCliente;
	private double saldoInicial;
	
	Conta(String nomeCliente, double saldo){
		this.nomeCliente = nomeCliente;
		this.saldoInicial = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
}
