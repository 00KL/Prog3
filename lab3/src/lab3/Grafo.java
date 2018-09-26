package lab3;

public class Grafo {
	private java.util.LinkedList<No> grafo = new java.util.LinkedList<>();

	public java.util.LinkedList<No> getGrafo() {
		return this.grafo;
	}

	public void setNo(No n) {
		grafo.add(n);
	}
	public void setNo(String n) {
		No t = new No(n);
		grafo.add(t);
	}
	
	public No getNo(String s) {
		for (No no : this.grafo) {
			String t = no.getIndex();
			if(t == s) {
				return no;
			}
		}
		return null;
	}
}
