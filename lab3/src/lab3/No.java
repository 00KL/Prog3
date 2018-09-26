package lab3;

public class No {
	private String index;
	private java.util.LinkedList<No> adjacencia;
	
	No(String index){
		this.index = index;
		adjacencia = new java.util.LinkedList<>();
	}
	
	public String getIndex() {
		return index;
	}
	
	public java.util.LinkedList<No> getAdjacencia() {
		java.util.LinkedList<No> n = new java.util.LinkedList<No>(adjacencia);
		return n;
	}
	public void setAdjacencia(No adjacencia) {
		this.adjacencia.add(adjacencia);
	}
	
	
}
