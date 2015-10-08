package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Boleto {
	private int numeros[]=new int [8];
	private static Scanner teclado = new Scanner(System.in);
	
	public Boleto() {
		boolean incorrecto;
		System.out.println("Escribe 8 numeros del 1 al 100 no repetidos");
		for (int i = 0; i < numeros.length; i++) {
			do{
				incorrecto = false;
				System.out.println((i+1)+"->");
				numeros[i]= teclado.nextInt();
				if(numeros[i]<=100 && numeros[i]>=1 ){
					for (int j = 0; j < numeros.length; j++) {
						if(numeros[i] == numeros[j] && i != j){
							incorrecto = true;
							break;
						}						
					}
				}else 
					incorrecto = true;
					
			}while(incorrecto);
		}
	}
	public Boleto(boolean random){
		boolean incorrecto;
		Random rand = new Random();
		for (int i = 0; i < numeros.length; i++) {
			do{
				incorrecto = false;
				
				numeros[i]= rand.nextInt(100)+1;
				if(numeros[i]<=100 && numeros[i]>=1){
					for (int j = 0; j < numeros.length; j++) {
						if(numeros[i] == numeros[j] && i!=j){
							incorrecto = true;
							break;
						}						
					}
				}else 
					incorrecto = true;					
			}while(incorrecto);
		}
	}
	public void mostrar()
	{
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]+"");
		}
	}
	public void comprobarBoleto(Boleto ganador){
		int ganadoresKop=0;
		int ganadores[] = new int [8];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if(this.numeros[i]==ganador.numeros[j] && i!=j){
					ganadores[ganadoresKop++]=this.numeros[i];
				}
			}
		}
		if(ganadoresKop!=0){
			System.out.print("Los nuemros ganadores son: ");
			for (int i = 0; i < ganadoresKop; i++) {
				System.out.print(ganadores[i]+" ");
			}
			System.out.println();
		}
		else{
			System.out.println("No hay numeros gnadores");
		}
	}
}
