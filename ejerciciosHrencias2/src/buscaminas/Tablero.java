package buscaminas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Tablero {
	ArrayList<Casilla> casillas;
	
	public Tablero() {
		Random r = new Random();
		int cont=0;
		boolean lleno = false;
		HashSet <Integer> minas = new HashSet<Integer>();
		while(!lleno){
			if(minas.add(r.nextInt(100)))				
				lleno = (10<++cont);			
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				casillas.add(new Casilla(i,j));
			}
		}		
	}
	
}
