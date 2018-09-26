package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		
		Grafo g = new Grafo();
		
		Scanner s = new Scanner(new File("test.txt"));
		String letras = s.nextLine();
		
		String letrasL[] = letras.split(";");
		for (String string : letrasL) {
			g.setNo(string);
		}
		
		java.util.LinkedList<No> atual = g.getGrafo();
		int cont = 0, cont1 = 0;
		
		while(s.hasNextLine()) {
			String linha = s.nextLine();
			linha = s.nextLine();
			String array[] = linha.split(";");
			for (String string : array) {
				if(string.equals("1")) {
					//System.out.printf("%s -> %s\n", atual.get(cont).getIndex(), atual.get(cont1).getIndex());
					atual.get(cont).setAdjacencia(atual.get(cont1));
					cont1++;
				}
			}
			cont1 = 0;
			cont++;
			//System.out.println();
			//System.out.println();
			
		}
		
		
		
		//Print
		System.out.println("digraph G{");
		java.util.LinkedList<No> ga = g.getGrafo();
		for (No n : ga) {
			System.out.println(n.getIndex());
			java.util.LinkedList<No> ad = n.getAdjacencia();
			for(No t : ad) {
				System.out.printf("%s -> %s\n", n.getIndex(), t.getIndex());
			}
		}
		System.out.println("}");
		
	}

}
