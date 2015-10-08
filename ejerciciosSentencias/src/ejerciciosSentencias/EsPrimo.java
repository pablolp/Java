package ejerciciosSentencias;

import java.util.Scanner;

public class EsPrimo {
	
	Scanner teclado = new Scanner(System.in);
	
	public static boolean primo(int valor){
		boolean ret = true;
		if (valor != 1){
			for(int i = 2; i<=Math.sqrt((double)valor);i++){
				if((valor % i)==0){
					ret = false;
					break;
				}
			}
		}
		return ret;
	}
	public  void miMain(){
		int valor ;
		System.out.print("Escriba un numero para saber si es primo o no :");
		valor = teclado.nextInt();
		System.out.println("el numero "+valor+((primo(valor)? "":" no"))+" es primo");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsPrimo programa = new EsPrimo();
		programa.miMain();
		
	}

}
