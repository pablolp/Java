package ejerciciosSentencias;

import java.util.Scanner;

public class DebajoDeLaMedia {
	
	Scanner teclado= new Scanner(System.in);
	public void porDebajo(int lista[]){
		int suma=0;
		double media;
		for (int sumador : lista)
			suma += sumador;
		media = (double)suma/lista.length;
		System.out.print("Los numeros: ");
		for (int valor : lista)
			if(valor < media)
				System.out.print(valor+" ");
		System.out.println("estan por debajo de la media.");
		
	}
	public void miMain(){
		int numeros[] = new int [10];
		OrdenInverso aux = new OrdenInverso();
		aux.leerNumeros(numeros);
		porDebajo(numeros);
		
	}
	public static void main(String[] args) {
		DebajoDeLaMedia programa = new DebajoDeLaMedia();
		programa.miMain();
	}
}
