package ejercicio4;

import java.util.Random;

public class Maquina extends Jugador {

	Random r;
	public Maquina(int max) {
		super(max);
		r= new Random();
		
	}

	@Override
	public void hacerApuesta() {
		setApuesta(getCantidad()+r.nextInt(max+1));		
		System.out.println("Mi apuesta es "+getApuesta());
	}

	@Override
	public void guardarCantidad() {
		setCantidad(r.nextInt(max+1));
		
	}

}
