package ejerciciosSentencias;

import java.util.Scanner;

public class Fecha {
	Scanner teclado = new Scanner(System.in);
	
	public void miMain(){
		int dia,mes,año;
		boolean correcto=false;
		do{
			System.out.println("Dime una fecha valida: dd mm aaaa");
			dia = teclado.nextInt(); 			
			mes = teclado.nextInt();			
			año = teclado.nextInt();
			if (año>0)
				if(mes>0&&mes<=12)
					if(dia>0&&dia<31)
						correcto = true;
		}while(!correcto);
		System.out.println("Nais!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha programa = new Fecha();
		programa.miMain();
	}

}
