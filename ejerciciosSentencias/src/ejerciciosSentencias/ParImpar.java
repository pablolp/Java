package ejerciciosSentencias;

import java.util.Scanner;

public class ParImpar {
	Scanner teclado;


	public static boolean esImpar(int valor){
		boolean ret;
		ret = (valor%2 == 1)? true : false ;
		return ret;
	}
	public void miMain(){
		int valor ;
		teclado = new Scanner(System.in);
		System.out.println("Escribe un numero :");		
		valor = teclado.nextInt();
		System.out.println("el valor "+valor+" es " +((esImpar(valor)?"impar." : "par")));
		teclado.close();
	}
	public static void main(String[] args){
		ParImpar programa = new ParImpar();
		programa.miMain();
	}
}
