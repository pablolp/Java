package buscaminas;

import java.util.Scanner;

public class Principal {
	Scanner teclado;
	Tablero tablero;
	public Principal() {
		tablero = new Tablero(10,10,10);
		teclado = new Scanner(System.in);
	}
	public static void main(String[] args) {		
		
		Principal programa = new Principal();
		int minaKop,x,y;
		while(true){
			
			try{
				x=programa.teclado.nextInt();
				y=programa.teclado.nextInt();
				minaKop =programa.tablero.pulsarCasilla(x,y);
				if(minaKop>=0)
					System.out.println(minaKop);
				else
					System.out.println("BUUM");
			}catch(CasillaExecption e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}
