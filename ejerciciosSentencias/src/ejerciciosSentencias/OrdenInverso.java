package ejerciciosSentencias;

import java.util.Scanner;

public class OrdenInverso {
	
	Scanner teclado = new Scanner(System.in);
	public void leerNumeros(int lista[]){
		System.out.print("Escriba "+lista.length+" numeros:");
		for (int i=0;i < lista.length;i++){			
			lista[i]= teclado.nextInt();
			if(i<lista.length-1)
				System.out.print("Faltan "+(lista.length-1-i)+":");
		}

	}
	public void escribirNumeros(int lista[]){
		System.out.print("Lista Inversa:");
		for(int i = lista.length-1;i>=0;i--){
			if (i!=0)
				System.out.print(lista[i]+ ", ");
			else 
				System.out.println(lista[i]);
		}
	}
	public void miMain(){
		int numeros[] = new int[10];
		leerNumeros(numeros);
		escribirNumeros(numeros);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdenInverso programa = new OrdenInverso();
		programa.miMain();
	}

}
