package ejercicio4;

import java.util.Scanner;

public class Humano extends Jugador {
	Scanner teclado;
	
	public Humano(int max) {
		super(max);
		teclado = new Scanner(System.in);
	}

	@Override
	public void hacerApuesta() {		
		System.out.println("Cuanto quieres apostar?");
		setApuesta(teclado.nextInt());
	}

	@Override
	public void guardarCantidad() {
		System.out.println("Cuanto quieres guardar?");
		setCantidad(teclado.nextInt());
	}

}
